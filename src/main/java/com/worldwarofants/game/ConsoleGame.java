package com.worldwarofants.game;

import com.worldwarofants.game.examplefeature.arch.ExampleModule;

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
        example = new ExampleModule();
    }

    public void run() {
        while (true) {
            String input = readInput();
            example.executeCommandByName(input);
        }
    }

    private String readInput() {
        return scanner.nextLine().toLowerCase();
    }
}
