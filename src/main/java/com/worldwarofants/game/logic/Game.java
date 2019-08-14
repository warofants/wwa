package com.worldwarofants.game.logic;

import java.util.ArrayList;

public class Game {
    private Player[] players;
    private World world;
    private int currentTick = 0;

    public Game(int numberOfPlayers) {
        players = new Player[numberOfPlayers];
        world = new World();

        for (int i = 0; i < numberOfPlayers; i++) {
            // Create new player object
            players[i] = new Player(0, 0);
            // Add queen's location to the world object
            world.addQueen(0, 0, i);
        }
    }

    /**
     * Main tick method, updates the game state
     */
    public void tick() {
        // Increment the in game tick counter
        currentTick++;

        // For example lets get a list of all active players
        ArrayList<Player> activePlayers = new ArrayList<>();

        for (int i = 0; i < players.length; i++) {
            if (players[i].isActive()) {
                activePlayers.add(players[i]);
            }
        }
    }

    /**
     * Method that checks end condition for the game
     * @return true if game has ended, false game is in progress
     */
    public boolean isFinished() {
        return true;
    }
}
