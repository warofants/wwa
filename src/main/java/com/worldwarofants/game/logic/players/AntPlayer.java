package com.worldwarofants.game.logic.players;

import com.worldwarofants.game.logic.colony.Colony;
import com.worldwarofants.game.logic.moves.antgroups.AntGroup;
import com.worldwarofants.game.logic.moves.antgroups.AttackGroup;
import com.worldwarofants.game.logic.species.AntSpecies;
import com.worldwarofants.game.logic.world.WorldEntity;

import java.util.ArrayList;

public class AntPlayer {
    private AntSpecies species;
    private boolean isHuman;
    private int playerNumber;

    private Colony colony;
    // TODO: WorldEntity should be replaced with a PartialWorldEntity that supports unknown values
    private ArrayList<WorldEntity> knownWorldEntities;

    private ArrayList<AntGroup> antGroups;

    // TODO: Define vars like "food", "brood", "etc"
    private int population;

    public AntPlayer(AntSpecies species, boolean isHuman, int playerNumber) {
        this.species = species;
        this.isHuman = isHuman;
        this.playerNumber = playerNumber;

        colony = new Colony(playerNumber);
        knownWorldEntities = new ArrayList<>();
        antGroups = new ArrayList<>();

        population = 0;
    }

    // TODO: this should return an array of actions to preform to the world object
    // TODO: Also take inputs from the call in Game
    public void move() {

    }

    /**
     * Add a new world entity to players's list of known entities
     * @param entity World entity that the players has discovered
     * @return if the list was changed
     */
    public boolean addKnownWorldEntity(WorldEntity entity) {
        // TODO: Add checks that we don't add a world entity we already have found
        return knownWorldEntities.add(entity);
    }

    /**
     * Create new attack party object and add to antGroups[]
     * @return reference to attack party object
     */
    public AttackGroup createAttackGroup() {
        // TODO: create party with stats
        AttackGroup attackGroup = new AttackGroup();

        // Add attack party to list of ant groups
        antGroups.add(attackGroup);

        return attackGroup;
    }
    /**
     * Create new attack party object and add to antGroups[]
     * @return reference to attack party object
     */
    public AttackGroup createScoutGroup() {
        // TODO: create party with stats
        AttackGroup attackGroup = new AttackGroup();

        // Add attack party to list of ant groups
        antGroups.add(attackGroup);

        return attackGroup;
    }
    /**
     * Create new attack party object and add to antGroups[]
     * @return reference to attack party object
     */
    public AttackGroup createScaveneGroup() {
        // TODO: create party with stats
        AttackGroup attackGroup = new AttackGroup();

        // Add attack party to list of ant groups
        antGroups.add(attackGroup);

        return attackGroup;
    }

    /**
     * remove a new world entity to players's list of known entities
     * @param entity World entity to remove
     * @return if this list contained the specified element
     */
    public boolean removeKnownWorldEntity(WorldEntity entity) {
        return knownWorldEntities.remove(entity);
    }

    public Colony getColony() {
        return colony;
    }

    public AntSpecies getSpecies() {
        return species;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void scalePopulation(double scaleFactor) {
        population *= scaleFactor;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
