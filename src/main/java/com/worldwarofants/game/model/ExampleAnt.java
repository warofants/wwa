package com.worldwarofants.game.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This just serves the purpose of showcasing the architecture.
 */
class ExampleAnt {

    private final String name;
    private ExampleAnt mate;
    private List<ExampleAnt> children;

    ExampleAnt(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void findNewMate(ExampleAnt ant) {
        mate = ant;
    }

    public ExampleAnt reproduce(String name) {
        ExampleAnt child = new ExampleAnt(name);
        children.add(child);
        return child;
    }

}
