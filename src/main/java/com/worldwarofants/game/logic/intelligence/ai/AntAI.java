package com.worldwarofants.game.logic.intelligence.ai;

import com.worldwarofants.game.logic.Player;
import com.worldwarofants.game.logic.intelligence.MoveMaker;

public class DefaultAI extends MoveMaker {
    public DefaultAI(Player player) {
        super(player);
    }

    @Override
    public int makeMove() {
        return 1;
    }
}
