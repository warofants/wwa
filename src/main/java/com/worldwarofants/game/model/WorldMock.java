package com.worldwarofants.game.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is only to show how the architecture works.
 * It also shows that mocking of the World is possible,
 * therefore allowing unit testing on classes who use it.
 *
 * TODO remove once architecture is approved.
 */
public class WorldMock extends World {

    private List<ExampleAnt> ants;

    public WorldMock() {
        super();
        ants = new ArrayList<>();
        initFirstAnts();
    }

    private void initFirstAnts() {
        ants.add(new ExampleAnt("charlie"));
        ants.add(new ExampleAnt("eve"));
    }

    @Override
    public ExampleAnt findAntByName(String name) {
        return ants.stream()
                .filter(ant -> name.equals(ant.getName()))
                .findAny()
                .orElse(null);
    }

    public void addAnt(ExampleAnt ant) {
        ants.add(ant);
    }

    public List<ExampleAnt> getAllAnts() {
        return ants;
    }
}
