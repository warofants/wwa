package com.worldwarofants.game.logic.intelligence;

import com.worldwarofants.game.logic.players.AntPlayer;
import com.worldwarofants.game.logic.world.WorldAPIRequest;

import java.util.ArrayList;

/**
 * Human intelligence. Requires inputs and outputs to be used with IO classes
 */
public class Human extends AntMoveMaker {
    public Human(AntPlayer antPlayer) {
        super(antPlayer);
    }

    @Override
    public ArrayList<WorldAPIRequest> makeMove() {
        // TODO: send text to screen asking for action

        // List of API requests the player will call
        ArrayList<WorldAPIRequest> requests = new ArrayList<>();

        // TODO: Switch state for different actions

        // Follow this example how to create a new AttackGroup entity
        requests.add(createAttackGroup());

        return requests;
    }
}
