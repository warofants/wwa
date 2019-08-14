package com.worldwarofants.game.logic;

/**
 * Basically a unit object.
 */
public class AntGroup extends Entity {
    private int numberOfAnts;
    private AntType type;

    public AntGroup(int numberOfAnts, AntType type, int x, int y) {
        super(x, y);
        this.numberOfAnts = numberOfAnts;
        this.type = type;
    }

    /**
     * Attempt to move the antGroup in the world
     */
    public void move(int x, int y) {

    }

    // What kind of ant group will be used for group specific traits
    enum AntType {
        WORKER,
        DRONE
    }
}
