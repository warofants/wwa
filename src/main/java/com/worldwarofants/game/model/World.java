package com.worldwarofants.game.model;

import com.worldwarofants.game.ConsoleGame;

/**
 * <p>
 * The World serves the role of the "database".
 * It should contain all information about the game models.
 * The World is what the Services interact with.
 * They should be the only ones with access to the World.
 * The Services will be used by the Controllers to gather the info in a nice way,
 * and to give it to the Controllers, which will then
 * will pass on the info to the Views, to be displayed. </p>
 * <p>
 * @see com.worldwarofants.game.arch.AbstractController
 * @see com.worldwarofants.game.arch.AbstractView
 */
public class World {

    private boolean isGameRunning = true;

    /**
     * This is used in the main game loop to check if it should keep looping.
     *
     * @see ConsoleGame
     */
    public boolean isGameRunning() {
        return isGameRunning;
    }

    /**
     * Call this when you think the main game loop should stop.
     *
     * @see ConsoleGame
     */
    public void gameOver() {
        isGameRunning = false;
    }
}
