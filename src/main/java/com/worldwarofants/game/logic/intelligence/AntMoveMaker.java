package com.worldwarofants.game.logic.intelligence;

import com.worldwarofants.game.logic.Player;

public abstract class MoveMaker {
    private Player player;

    public MoveMaker(Player player) {
        this.player = player;
    }

    // TODO: makeMove should return list of changes to World
    public abstract int makeMove();

    public Player getPlayer() {
        return player;
    }
}
