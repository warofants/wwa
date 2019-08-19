package com.worldwarofants.game.logic.actions.attack;

import com.worldwarofants.game.logic.intelligence.Human;
import com.worldwarofants.game.logic.actions.MiniGame;
import com.worldwarofants.game.logic.players.AntPlayer;
import com.worldwarofants.game.logic.world.WorldAPIRequest;

import java.util.ArrayList;

public class AttackMiniGame implements MiniGame {
    public AttackMiniGame() {
    }

    @Override
    public ArrayList<WorldAPIRequest> run(Human human, String input) {
        // Get player object
        AntPlayer player = human.getAntPlayer();
        return null;
    }
}
