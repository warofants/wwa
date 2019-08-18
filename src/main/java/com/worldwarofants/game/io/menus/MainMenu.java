package com.worldwarofants.game.io.menus;

import com.worldwarofants.game.logic.Game;

public class MainMenu {
    public void open() {
        startGame(new Game(4, 5));
    }

    private void loadGame() {
        // TODO save load team, load a game
    }

    private void newGame() {
    }

    private void editOptions() {

    }

    private void startGame(Game game) {
        game.start();
    }
}
