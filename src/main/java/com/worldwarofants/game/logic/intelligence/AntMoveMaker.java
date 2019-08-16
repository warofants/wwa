package com.worldwarofants.game.logic.intelligence;

import com.worldwarofants.game.logic.moves.antgroups.AttackGroup;
import com.worldwarofants.game.logic.players.AntPlayer;
import com.worldwarofants.game.logic.world.WorldAPI;
import com.worldwarofants.game.logic.world.WorldAPIRequest;
import com.worldwarofants.game.logic.world.entities.WorldAntGroupWrapper;
import com.worldwarofants.game.logic.world.entities.WorldColonyWrapper;

import java.util.ArrayList;

/**
 * Base class for ant players
 */
public abstract class AntMoveMaker {
    private AntPlayer antPlayer;

    public AntMoveMaker(AntPlayer antPlayer) {
        this.antPlayer = antPlayer;
    }

    public abstract ArrayList<WorldAPIRequest> makeMove();

    public AntPlayer getAntPlayer() {
        return antPlayer;
    }

    /**
     * Get players colony api wrapper
     * @return WorldColonyWrapper object owned by player
     */
    private WorldColonyWrapper getColonyWrapper() {
        return WorldAPI.getColonyAPIWrapper(antPlayer.getPlayerNumber());
    }

    /**
     * Example on how to create a request for a new attack group on top of player colony
     * @return WorldAPIRequest to be returned to Game
     */
    WorldAPIRequest createAttackGroup() {
        // Get colony wrapper so attack group can be created in the same spot
        WorldColonyWrapper colonyWrapper = getColonyWrapper();

        // Create new attack group
        AttackGroup attackGroup = antPlayer.createAttackGroup();

        // Wrap attack group so it can be sent to the API
        WorldAntGroupWrapper wrapper = new WorldAntGroupWrapper(
                colonyWrapper.getPosX(), // antgroup starts on colony x
                colonyWrapper.getPosY(), // antgroup starts on colony y
                0, // uid of 0 will cause a random uid to be chosen (you should always use 0)
                attackGroup // Attack group object we're wrapping
        );

        // Create the request with...
        WorldAPIRequest request = new WorldAPIRequest(
                // Request type (add entity)
                WorldAPIRequest.WorldEventType.ADD_ENTITY,
                // Request entity
                wrapper
        );

        return request;
    }
}
