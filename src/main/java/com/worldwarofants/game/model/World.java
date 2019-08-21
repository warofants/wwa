package com.worldwarofants.game.model;

import java.util.List;

/**
 * <p>
 * The World serves the role of the "database".
 * It should contain all information about the game models.
 * The World is what the Controllers interact with,
 * and where they get the information to give to the views. </p>
 * <p>
 * If at one point this class starts to get too long,
 * a new layer of the architecture will be added,
 * to split up the queries in the World class.
 * </p>
 * @see com.worldwarofants.game.arch.AbstractController
 * @see com.worldwarofants.game.arch.AbstractView
 */
public class World {

    /**
     * Method that is mocked by WorldMock.
     * TODO remove once architecture is approved.
     */
    public void addAnt(ExampleAnt child) {

    }

    /**
     * Method that is mocked by WorldMock.
     * TODO remove once architecture is approved.
     */
    public ExampleAnt findAntByName(String name) {
        return null;
    }

    /**
     * Method that is mocked by WorldMock.
     * TODO remove once architecture is approved.
     */
    public List<ExampleAnt> getAllAnts() {
        return null;
    }
}
