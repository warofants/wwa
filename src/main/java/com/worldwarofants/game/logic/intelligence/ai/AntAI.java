package com.worldwarofants.game.logic.intelligence.ai;

import com.worldwarofants.game.logic.intelligence.AntMoveMaker;
import com.worldwarofants.game.logic.players.AntPlayer;
import com.worldwarofants.game.logic.world.WorldAPIRequest;

import java.util.ArrayList;

public class AntAI extends AntMoveMaker {
    public AntAI(AntPlayer antPlayer) {
        super(antPlayer);
    }

    @Override
    public ArrayList<WorldAPIRequest> makeMove() {
        return null;
    }
}
