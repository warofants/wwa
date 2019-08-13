package world.war.ants.gui;


import world.war.ants.game.World;
import java.util.Scanner;
/**
 * Main user interface.
 */
public class MainUserInterface {
    /**
     * Player ID so that we can keep track.
     */
    boolean turnDone = false;
    private int playerID;
    private World game;
    private Scanner scanner;
    private UserInterface userInterface;
    public MainUserInterface(World game) {
        this.game = game;
        scanner = new Scanner(System.in);
    }

    public void run() {
        while(!turnDone) {
            //Process...
        }
    }
}
