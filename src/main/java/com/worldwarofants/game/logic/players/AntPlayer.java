package com.worldwarofants.game.logic;

import com.worldwarofants.game.logic.colony.Colony;
import com.worldwarofants.game.logic.species.Species;
import com.worldwarofants.game.logic.world.WorldEntity;

import java.util.ArrayList;

public class Player {
    private Species species;
    private boolean isHuman;
    private int playerNumber;

    private Colony colony;
    // TODO: WorldEntity should be replaced with a PartialWorldEntity that supports unknown values
    private ArrayList<WorldEntity> knownWorldEntities;

    public Player(Species species, boolean isHuman, int playerNumber) {
        this.species = species;
        this.isHuman = isHuman;
        this.playerNumber = playerNumber;

        colony = new Colony();
        knownWorldEntities = new ArrayList<>();
    }

    // TODO: this should return an array of actions to preform to the world object
    // TODO: Also take inputs from the call in Game
    public void move() {

    }

    /**
     * Add a new world entity to player's list of known entities
     * @param entity World entity that the player has discovered
     * @return if the list was changed
     */
    public boolean addKnownWorldEntity(WorldEntity entity) {
        // TODO: Add checks that we don't add a world entity we already have found
        return knownWorldEntities.add(entity);
    }

    /**
     * remove a new world entity to player's list of known entities
     * @param entity World entity to remove
     * @return if this list contained the specified element
     */
    public boolean removeKnownWorldEntity(WorldEntity entity) {
        return knownWorldEntities.remove(entity);
    }

    public Colony getColony() {
        return colony;
    }

    public Species getSpecies() {
        return species;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
}
