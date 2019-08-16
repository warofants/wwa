package com.worldwarofants.game.logic.intelligence;

import com.worldwarofants.game.logic.players.WildPlayer;
import com.worldwarofants.game.logic.world.WorldAPIRequest;

import java.util.ArrayList;

public abstract class WildMoveMaker {
    private WildPlayer wildPlayer;

    public WildMoveMaker(WildPlayer wildPlayer) {
        this.wildPlayer = wildPlayer;
    }

    public abstract ArrayList<WorldAPIRequest> makeMove();

    public WildPlayer getWildPlayer() {
        return wildPlayer;
    }
}
