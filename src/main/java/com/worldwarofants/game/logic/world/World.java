package com.worldwarofants.game.logic.world;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Predicate;

public class World {
    // HashMap storing World Entities
    private HashMap<Integer, WorldEntity> worldEntities;

    private int width, height;

    public World(int width, int height) {
        worldEntities = new HashMap<>();

        this.width = width;
        this.height = height;
    }

    /**
     * Add new entity to world object
     * set entity.uid = 0 to automatically generate a new uid
     * set entity.xPos = entity.yPos = -1 to choose random position
     * @param entity entity to add
     * @return if entity is added
     */
    boolean addWorldEntity(WorldEntity entity) {
        // A uid of less than or equal to 0 must get replaced with random uid
        if (entity.getUid() <= 0) {
            entity.setUid(getNewUID());
        }

        if (entity.getPosX() == -1 && entity.getPosY() == -1) {
            setRandomPosition(entity);
        }

        // Check if entity is in bounds
        if (isOutOfBounds(entity)) {
            return false;
        }

        // Check if uid is in map
        if (worldEntities.containsKey(entity.getUid())) {
            return false;
        } else {
            worldEntities.put(entity.getUid(), entity);
            return true;
        }
    }

    /**
     * Remove an entity from the world
     * @param entity entity to remove
     * @return if list was changed
     */
    boolean removeWorldEntity(WorldEntity entity) {
        return worldEntities.remove(entity.getUid()) != null;
    }

    /**
     * Edit world entity properties
     * @param updated WorldEntity with same uid and different properties
     * @return if entity was updated
     */
    boolean putWorldEntity(WorldEntity updated) {
        // Check if entity is in bounds

        if (isOutOfBounds(updated)) {
            return false;
        }

        // Check if uid is in map
        if (worldEntities.containsKey(updated.getUid())) {
            worldEntities.replace(updated.getUid(), updated);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get an entity from worldEntities
     * @param uid has key
     * @return WorldEntity with uid stored at uid
     */
    WorldEntity getEntityFromUid(int uid) {
        return worldEntities.get(uid);
    }

    /**
     * Get world entities matching a predicate filter
     * @param filter https://www.geeksforgeeks.org/java-8-predicate-with-examples/
     * @return ArrayList of world entities matching filter
     */
    ArrayList<WorldEntity> getEntitiesFromFilter(Predicate<WorldEntity> filter) {
        ArrayList<WorldEntity> entities = new ArrayList<>();

        // Loop through each world entity
        worldEntities.forEach((uid, entity) -> {
            // Test the predicate
            if (filter.test(entity)) {
                entities.add(entity);
            }
        });

        return entities;
    }

    /**
     * Generate a random uid that hasn't been used yet
     * @return uid
     */
    private int getNewUID() {
        int id = (int) (Math.random() * 50000) + 1;

        if (worldEntities.keySet().contains(id)) {
            // Recursively look for a new key
            return getNewUID();
        } else {
            return id;
        }
    }

    /**
     * Set position of entity to a random spot.
     * 0 <= x <= width
     * 0 <= y <= height
     * @param entity entity to update
     */
    private void setRandomPosition(WorldEntity entity) {
        int x = (int) (Math.random() * this.width);
        int y = (int) (Math.random() * this.height);

        entity.setPosX(x);
        entity.setPosY(y);
    }

    /**
     * Checks if entity is within bounds of the world
     * @param entity entity to check
     * @return if entity is in bounds
     */
    private boolean isOutOfBounds(WorldEntity entity) {
        return entity.getPosX() < 0 || entity.getPosX() > width || entity.getPosY() < 0 || entity.getPosY() > height;
    }
}
