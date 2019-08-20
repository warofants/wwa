package com.worldwarofants.game.io;

import com.worldwarofants.game.logic.Entity;
import java.util.List;
import java.util.LinkedList;

/**
 * A class that handles the storing of the state of the game.
 * It will store
 */
public class GameMap {
    private char[][] fullMap;
    private int viewableXKeystone;//rows
    private int viewableYKeystone;//cols
    public GameMap() {
        fullMap = new char[Integer.MAX_VALUE][Integer.MAX_VALUE];

    }
    public void addEntity(Entity entity) {

    }
}
