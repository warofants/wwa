package com.worldwarofants.game;

import com.worldwarofants.game.examplefeature.arch.ExampleModule;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.model.WorldMock;

import java.util.Scanner;

/**
 * TODO write docs
 *
 * @author Veradux
 */
class ConsoleGame {

    private Scanner scanner;
    private ExampleModule example;

    ConsoleGame() {
        scanner = new Scanner(System.in);
        // TODO replace WorldMock() with the Actual World that will be used
        World world = new WorldMock();
        example = new ExampleModule(world);
    }

    public void run() {
        while (true) {
            example.executeCommand(readInput());
        }
    }

    private String readInput() {
        return scanner.nextLine().trim().toLowerCase();
    }
}
