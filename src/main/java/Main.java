package main.java;

import main.java.logic.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(4);

        while (!game.isFinished()) {
            game.tick();
            // Render goes here
        }

        System.out.println("worked");
    }
}
