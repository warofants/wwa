package com.worldwarofants.game.logic.moves.scout;

import com.worldwarofants.game.logic.intelligence.Human;
import com.worldwarofants.game.logic.moves.MiniGame;
import com.worldwarofants.game.logic.players.AntPlayer;
import com.worldwarofants.game.logic.world.WorldAPIRequest;

import java.util.ArrayList;

public class ScoutMiniGame implements MiniGame {
    @Override
    public ArrayList<WorldAPIRequest> run(Human human) {
        // Get player object
        AntPlayer player = human.getAntPlayer();
        return null;
    }
}
