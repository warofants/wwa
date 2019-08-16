package com.worldwarofants.game.io;

import com.worldwarofants.game.logic.Game;

public class MainMenu {
    public void open() {

    }

    public void loadGame() {
        // TODO save load team, load a game
        startGame(new Game());
    }

    public void newGame() {
        startGame(new Game());
    }

    public void editOptions() {

    }

    public void startGame(Game game) {
        game.start();
    }
}
