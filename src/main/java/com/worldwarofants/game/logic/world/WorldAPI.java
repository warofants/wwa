package com.worldwarofants.game.logic.world;

import com.worldwarofants.game.logic.world.entities.WorldColonyWrapper;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * API wrapper class to implement WorldAPIRequest actions
 */
public class WorldAPI {
    private static World world;

    public static void createWorld(int width, int height) {
        world = new World(width, height);
    }

    public static boolean call(WorldAPIRequest event) {
        WorldEntity entity = event.getEntity();
        switch (event.getType()) {
            case DELETE_ENTITY:
                return world.removeWorldEntity(entity);
            case ADD_ENTITY:
                return world.addWorldEntity(entity);
            case PUT_ENTITY:
                return world.putWorldEntity(entity);
        }

        return false;
    }

    /**
     * Simple get entity by uid function
     * @param uid id for entity
     * @return First (and only) entity with uid
     */
    public static WorldEntity getEntity(int uid) {
        return world.getEntityFromUid(uid);
    }

    /**
     * Get world entities matching a predicate filter
     * @param filter https://www.geeksforgeeks.org/java-8-predicate-with-examples/
     * @return ArrayList of world entities matching filter
     */
    public static ArrayList<WorldEntity> getEntitiesFromFilter(Predicate<WorldEntity> filter) {
        return world.getEntitiesFromFilter(filter);
    }

    /**
     * Return list of entities at a specific position
     * @param posX x position of entities
     * @param posY y position of entities
     * @return ArrayList of world entities at defined position
     */
    public static ArrayList<WorldEntity> getEntitiesAtPosition(int posX, int posY) {
        return getEntitiesFromFilter(entity -> entity.getPosX() == posX && entity.getPosY() == posY);
    }

    /**
     * Get colony api wrapper controlled by a player. Also acts as an example how to use getEntitiesFromFilter()
     * @param playerNumber player id that owns the colony
     * @return WorldColonyWrapper object that has same .playerNumber parameter as playerNumber
     */
    public static WorldColonyWrapper getColonyAPIWrapper(int playerNumber) {
        // Call get entities from filter
        return (WorldColonyWrapper) WorldAPI.getEntitiesFromFilter(entity -> {
            // Filter out type !== Colony
            if (entity.getType().equals(WorldEntity.EntityType.COLONY)) {
                // Return if colony object is owned by the correct player
                return ((WorldColonyWrapper) entity).getColony().getPlayerNumber() == playerNumber;
            }
            return false;
        }).get(0); // Return first (and only) found instance
    }
}
