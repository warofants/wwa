package com.worldwarofants.game.logic.actions.queen;

import com.worldwarofants.game.logic.intelligence.Human;
import com.worldwarofants.game.logic.actions.MiniGame;
import com.worldwarofants.game.logic.players.colony.Colony;
import com.worldwarofants.game.logic.players.AntPlayer;
import com.worldwarofants.game.logic.world.WorldAPIRequest;

import java.util.ArrayList;

public class QueenProgressionMiniGame implements MiniGame {
    public QueenProgressionMiniGame() {
    }

    @Override
    public ArrayList<WorldAPIRequest> run(Human human, String input) {
        // Get player object
        AntPlayer player = human.getAntPlayer();
        // Get colony object
        Colony colony = player.getColony();
        return null;
    }
}
