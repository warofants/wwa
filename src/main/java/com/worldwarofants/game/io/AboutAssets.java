package com.worldwarofants.game.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class AboutAssets {

    /**
     * Returns a String object from a File from the assets folder
     * @param file
     * @return sb
     */
    public String readAsset(File file) {
        StringBuilder sb = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get("src\\main\\java\\com\\worldwarofants\\game\\assets\\" + file))) {
            stream.forEach(s -> sb.append(s + "\n"));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return sb.toString();
    }
}
