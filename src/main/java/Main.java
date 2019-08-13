package main.java;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import main.java.logic.Game;

public class Main {

    public static void main(String[] args) {
        printLogo();
        Game game = new Game(4);

        while (!game.isFinished()) {
            game.tick();
            // Render goes here
        }
    }

    private static void printLogo() {
        try (Stream<String> stream = Files.lines(Paths.get("Logo.txt"))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
