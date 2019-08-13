package io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    private File file;

    public FileReader(File file) {
        this.file = file;
    }

    public String read() {
        StringBuilder sb = new StringBuilder();
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return sb.toString();
    }
}
