import java.util.List;
import java.io.PrintStream;
import java.io.OutputStream;
import java.io.IOException;
import java.lang.StringBuilder;
//TODO: Allow scrolling
//TODO: Construction of GameMap
/**
 * Contains the state of the game map
 * @version 1.1
 */
package com.worldwarofants.game.io;
class GameMap {
    private short numRows, numCols;
    private int[][] fullMap;
    private int[][] userView;
    private final PrintStream outStream = new PrintStream("GameState.txt");
    public GameMap() {
        System.setOut(outStream);
    }

    /**
     * Method that prints the game map to the console
     */
    public void printMap() {
        for (int row = 0; row < userView.length; row++) {
            for (int col = 0; col < userView[i].length; col++) {
                System.out.print(userView[row][col]);
            }
        }
    }

}
