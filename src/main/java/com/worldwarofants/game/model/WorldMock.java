package com.worldwarofants.game.model;

import java.util.Arrays;
import java.util.List;

/**
 * This class is only to show how the architecture works.
 * And to show that mocking of the World is possible, therefore allowing unit testing.
 */
public class WorldMock extends World {

    private List<ExampleAnt> ants;

    public WorldMock() {
        super();
        ants = initFirstAnts();
    }

    private List<ExampleAnt> initFirstAnts() {
        ExampleAnt charlie = new ExampleAnt("Charlie");
        ExampleAnt jenny = new ExampleAnt("Jennifer");
        jenny.findNewMate(charlie);
        return Arrays.asList(charlie, jenny);
    }

}
