package main.java;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import main.java.logic.Game;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(4);

        while (!game.isFinished()) {
            game.tick();
            // Render goes here
        }
    }
}
