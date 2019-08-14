package com.worldwarofants.game;

import com.worldwarofants.game.logic.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(4);

        while (!game.isFinished()) {
            game.tick();
            // Render goes here
        }

        System.out.println("Worked");
    }
}
