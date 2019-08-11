
import java.util.Scanner;
/**
 * Main user interface.
 */
public class MainUserInterface {
    /**
     * Player ID so that we can keep track.
     */
    private int playerID;
    private Game game;
    private Scanner scanner;
    private UserInterface userInterface;
    public MainUserInterface(Game game) {
        this.game = game;
        scanner = new Scanner(System.in);
    }

    public void run() {
        for(;;) {
            if(userInterface != null) {
                
            }
        }
    }
}
