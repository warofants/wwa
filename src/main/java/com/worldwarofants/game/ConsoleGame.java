package com.worldwarofants.game;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.ModuleManager;
import com.worldwarofants.game.examplefeature.arch.ExampleModule;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.model.WorldMock;

import java.util.Scanner;

/**
 * TODO write docs
 *
 * @author Veradux
 */
class ConsoleGame extends ModuleManager {

    private Scanner scanner;
    private World world;

    ConsoleGame() {
        scanner = new Scanner(System.in);
        // TODO replace WorldMock() with World(), once architecture is approved.
        world = new WorldMock();
        defineModules();
    }

    @Override
    protected AbstractModule defineStartingModule() {
        return new ExampleModule(world, this);
    }

    private void defineModules() {
        // Whenever you create a new Module, add it to the game like this.
        addModule(new ExampleModule(world, this));
    }

    public void run() {
        // This is how to manually execute commands.
        currentModule.executeCommand("gameTitle");
        while (true) {
            // This is how to let the user execute commands.
            currentModule.executeCommand(readInput());
        }
    }

    private String readInput() {
        return scanner.nextLine().trim();
    }
}
