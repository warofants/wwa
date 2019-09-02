package com.worldwarofants.game.model;

/**
 * This just serves the purpose of showcasing the architecture.
 */
public class ExampleAnt {

    private final String name;

    public ExampleAnt(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ExampleAnt reproduce(String name) {
        return new ExampleAnt(name);
    }
}
