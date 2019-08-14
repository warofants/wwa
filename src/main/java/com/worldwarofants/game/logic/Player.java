package com.worldwarofants.game.logic;

import java.util.ArrayList;

/**
 * Player class holding player specific data
 */
public class Player {
    private Queen queen;
    private ArrayList<AntGroup> antGroups;
    private boolean isActive;

    public Player(int queenX, int queenY) {
        antGroups = new ArrayList<>();
        queen = new Queen(queenX, queenY);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
