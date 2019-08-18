package com.worldwarofants.game.logic.intelligence.ai;

import com.worldwarofants.game.logic.intelligence.WildMoveMaker;
import com.worldwarofants.game.logic.players.WildPlayer;
import com.worldwarofants.game.logic.world.WorldAPI;
import com.worldwarofants.game.logic.world.WorldAPIRequest;

import java.util.ArrayList;

public class WildAI extends WildMoveMaker {
    public WildAI(WildPlayer wildPlayer) {
        super(wildPlayer);
    }

    @Override
    public ArrayList<WorldAPIRequest> makeMove() {
        return new ArrayList<>();
    }
}
