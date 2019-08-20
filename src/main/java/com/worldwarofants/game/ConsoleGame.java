package com.worldwarofants.game;

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
    // TODO make a connection between modules
    private ExampleModule example;
    private ExampleModule example2;
    private ExampleModule currentModule;

    ConsoleGame() {
        scanner = new Scanner(System.in);
        // TODO replace WorldMock() with World(), once architecture is approved.
        World world = new WorldMock();
        example = new ExampleModule(world);
        example2 = new ExampleModule(world);
        currentModule = defineStartingModule(world);
    }

    private ExampleModule defineStartingModule(World world) {
        return new ExampleModule(world);
    }

    public void run() {
        // This is how you can manually execute commands.
        currentModule.executeCommand("gameTitle");
        while (true) {
            // This is how you can let the user execute commands.
            currentModule.executeCommand(readInput());
        }
    }

    private String readInput() {
        return scanner.nextLine().trim();
    }
}
