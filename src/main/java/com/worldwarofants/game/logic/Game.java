package com.worldwarofants.game.logic;

import com.worldwarofants.game.logic.intelligence.WildMoveMaker;
import com.worldwarofants.game.logic.intelligence.ai.AntAI;
import com.worldwarofants.game.logic.intelligence.Human;
import com.worldwarofants.game.logic.intelligence.AntMoveMaker;
import com.worldwarofants.game.logic.intelligence.ai.WildAI;
import com.worldwarofants.game.logic.players.AntPlayer;
import com.worldwarofants.game.logic.players.WildPlayer;
import com.worldwarofants.game.logic.players.species.AntSpecies;
import com.worldwarofants.game.logic.world.WorldAPI;
import com.worldwarofants.game.logic.world.WorldAPIRequest;
import com.worldwarofants.game.logic.world.entities.WorldColonyWrapper;

import java.util.ArrayList;

public class Game {
    private AntPlayer[] antPlayers;
    private AntMoveMaker[] intelligences;

    private WildPlayer[] wildPlayers;
    private WildMoveMaker[] wildIntelligences;

    private int numberOfAntPlayers;
    private int numberOfWildPlayers;

    private int tickCounter;
    private int turnCounter;

    //TODO Save-Load team needs to write constructors for a new game and a load game
    public Game(int numberOfAntPlayers, int numberOfWildPlayers) {
        this.numberOfAntPlayers = numberOfAntPlayers;
        this.numberOfWildPlayers = numberOfWildPlayers;
    }

    public void start() {
        // Start in game time counter
        tickCounter = 0;
        turnCounter = 0;

        // Create players instances
        initializeAntPlayers();
        // Create wild players instances
        initializeWildPlayers();

        // Create world instance
        initializeWorld();

        // While the game isn't over
        while (!isFinished()) {
            System.out.println("Making move " + turnCounter);
            // Make move
            playTurns();
        }

        // TODO: Ending sequence and send back to main menu
        System.out.println("The game is over");
    }

    /**
     * Create players instances
     */
    private void initializeAntPlayers() {
        antPlayers = new AntPlayer[numberOfAntPlayers];
        intelligences = new AntMoveMaker[numberOfAntPlayers];

        for (int i = 0; i < numberOfAntPlayers; i++) {
            // Create new antPlayers
            boolean isHuman = i == 0;
            antPlayers[i] = new AntPlayer(new AntSpecies(), isHuman, i);

            if (isHuman) {
                // Todo an AntSpecies type should be required when creating player
                intelligences[i] = new Human(antPlayers[i]);
            } else {
                intelligences[i] = new AntAI(antPlayers[i]);
            }
        }
    }

    private void initializeWildPlayers() {
        wildPlayers = new WildPlayer[numberOfWildPlayers];
        wildIntelligences = new WildMoveMaker[numberOfWildPlayers];

        for (int i = 0; i < numberOfWildPlayers; i++) {
            // Create new wildPlayers
            // Todo A WildSpecies type should be required when creating player
            wildPlayers[i] = new WildPlayer();
            wildIntelligences[i] = new WildAI(wildPlayers[i]);
        }
    }

    /**
     * Add starting entities to world object
     */
    private void initializeWorld() {
        // TODO: Width and Height should be defined in constant folder
        // Create world object and set width and height
        WorldAPI.createWorld(500, 500);

        // Add each player colony to the world API
        for (AntPlayer player : antPlayers) {
            // (-1, -1) causes new random position to be choose and uid of 0 causes random uid
            WorldColonyWrapper colonyWrapper = new WorldColonyWrapper(-1, -1, 0, player.getColony());
            // Generate the request
            WorldAPIRequest request = new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, colonyWrapper);

            // Check if the call fails
            boolean result = WorldAPI.call(request);

            if (!result) {
                System.err.println("API CALL FAILED: call failed trying to make colony" + request.toString());
            }
        }

        // TODO: Wild players should be added
        // TODO: Obstacles / terrain elements should be generated
    }

    /**
     * Make moves for each player and wild NPC
     */
    private void playTurns() {
        for (AntMoveMaker intelligence: intelligences) {
            ArrayList<WorldAPIRequest> requests = antMove(intelligence);

            for (WorldAPIRequest request: requests) {
                // Call the API with changes
                boolean result = WorldAPI.call(request);

                // If the call to API failed
                if (!result) {
                    System.err.println("API CALL FAILED " + request.toString());
                }
            }

            // TODO: Values team update ant values after players turn
            updateStateAntPlayer(intelligence);

            // increment game time
            tick();
        }

        for (WildMoveMaker wildIntelligence: wildIntelligences) {
            ArrayList<WorldAPIRequest> requests = wildMove(wildIntelligence);

            for (WorldAPIRequest request: requests) {
                // Call the API with changes
                boolean result = WorldAPI.call(request);

                // If the call to API failed
                if (!result) {
                    System.err.println("API CALL FAILED " + request.toString());
                }
            }

            // TODO: Values team update wild values after players turn
            updateWildState(wildIntelligence);

            // increment game time
            tick();
        }

        addTurn();
    }

    private void updateStateAntPlayer(AntMoveMaker intelligence) {
        // TODO: Update player values
        // For example decrease population by 5%
        intelligence.getAntPlayer().scalePopulation(0.95);

        // TODO: move AntGroup objects in the world
        // TODO: update fog of war
    }

    private void updateWildState(WildMoveMaker wildIntelligence) {
        // TODO: wild player logic (ant eaters, wasps, humans, etc)
    }

    /**
     * Request a move to be made by a ant player
     * @param intelligence AntMoveMaker instance that needs to make a move
     * @return list of action to apply to the world
     */
    private ArrayList<WorldAPIRequest> antMove(AntMoveMaker intelligence) {
        return intelligence.makeMove();
    }

    /**
     * Request a move to be made by a wild player
     * @param wildIntelligence WildMoveMaker instance that needs to make a move
     * @return list of action to apply to the world
     */
    private ArrayList<WorldAPIRequest> wildMove(WildMoveMaker wildIntelligence) {
        return wildIntelligence.makeMove();
    }

    /**
     * Increment the in game tick counter
     */
    private void tick() {
        this.tickCounter++;
    }

    /**
     * Increment the in game turn counter
     */
    private void addTurn() {
        this.turnCounter++;
    }

    /**
     * Check if the game has reached end condition
     */
    private boolean isFinished() {
        return turnCounter > 10;
    }
}
