package com.worldwarofants.game.logic.actions.scavenge;

import com.worldwarofants.game.logic.intelligence.Human;
import com.worldwarofants.game.logic.actions.MiniGame;
import com.worldwarofants.game.logic.players.AntPlayer;
import com.worldwarofants.game.logic.world.WorldAPIRequest;

import java.util.ArrayList;

public class ScavengeMiniGame implements MiniGame {
    public ScavengeMiniGame() {
    }

    @Override
    public ArrayList<WorldAPIRequest> run(Human human, String input) {
        // Get player object
        AntPlayer player = human.getAntPlayer();
        return null;
    }
}
