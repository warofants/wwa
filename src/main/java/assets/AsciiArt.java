import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 * Class responsible for taking requests for ascii art.
 *
 * General method for storing and accessing Ascii Art:
 * Store the art in a .txt in the assets package. To retrieve the
 * contents, call getArtFrom(fileName) with fileName being a String
 * containing the exact name of the file located in the assets package.
 * Ex: String snowmanArt = AsciiArt.getArtFrom("Snowman.txt");
 */
package com.worldwarofants.game.assets;
public class AsciiArt {
    public AsciiArt() {}

    /**
     * A method that reads a given file and returns the contents
     * @param fileName is the requested file
     * @return the art contained within the file
     */
    public static String getArtFrom(String fileName) {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String art = "";
            String line;
            while((line = reader.readLine()) != null) {
                art += line;
            }
            return art;
        } catch (IOException ioe) {
            /*Prints the stack trace of the exception and returns a table
             * being flipped in rage at the error*/
            ioe.printStackTrace();
            return "ERROR\n(╯°□°）╯︵ ┻━┻";
        }
    }
}