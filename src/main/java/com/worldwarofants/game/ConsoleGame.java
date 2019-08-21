package com.worldwarofants.game;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.ModuleManager;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.examplefeature.arch.ExampleModule;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.model.WorldMock;

import java.util.Scanner;

/**
 * The ConsoleGame class is the one that controls the main game loop.
 * It is where console commands come in, and are executed.
 * This is also where you set up the game modules.
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
    }

    /**
     * This is the main game loop.
     * It keeps track of the current Module.
     * The current Module is the last one to which a Controller has navigated to.
     *
     * @see IModuleNavigator
     * @see AbstractController
     */
    public void run() {
        // This is how to manually execute commands.
        // Here will be placed the opening command of the game.
        currentModule.executeCommand("gameTitle");

        // TODO implement a way to end the game loop.
        while (true) {
            // This is how to let the user execute commands.
            // Nothing else will need to be added here.
            currentModule.executeCommand(readInput());
        }
    }

    @Override
    protected AbstractModule defineStartingModule(IModuleNavigator navigator) {
        return new ExampleModule(world, navigator);
    }

    @Override
    protected void defineModules(IModuleNavigator navigator) {
        addModule(new ExampleModule(world, navigator));
    }

    private String readInput() {
        return scanner.nextLine().trim();
    }
}
