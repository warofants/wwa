package com.worldwarofants.game.utils;

import java.lang.ClassLoader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * The AsciiArtReader class is a utility class responsible for grabbing AsciiArt
 * from the resources folder and passing it as a string to other parts of the wwa
 * program. The naming schema for resource files is CONSTANT.foo
 *
 * @author Elbert
 */
public class AsciiArtReader {
    private static final String fileNameFormat;
    private static ClassLoader classLoader;

    //Empty constructor
    public AsciiArtReader() {}

    //Static constructor, initializes the static class variables
    static {
        fileNameFormat = "art/%s";//A format string for the filename to be slotted into
        classLoader = ClassLoader.getSystemClassLoader();
    }

    public static String getArtFrom(String fileName) {
        //Subs fileName into the formatted string
        String completeFileName = String.format(fileNameFormat,fileName);

        try(//try-with-resources is declared
                InputStreamReader fileReader = new InputStreamReader(
                        classLoader.getResourceAsStream(completeFileName)
                )
        ) {
            /* Data from the InputStreamReader is read as an int, dataByte
             * dataByte is converted to a char and appended to the String, art
             * art is returned */
            int dataByte;
            String art = "";
            while((dataByte = fileReader.read()) != -1) {
                art += (char)dataByte;//Appends the char to the art String
            }
            return art;
        } catch(FileNotFoundException noFileFoundException) {
            noFileFoundException.printStackTrace();
            System.err.println(
                    "File most likely misnamed or does not exist in resources folder."
            );
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return null;
    }
}
