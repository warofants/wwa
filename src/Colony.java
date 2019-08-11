
import java.util.ArrayList;

/**
 * Basically, this is a player. 
 */
public class Colony {
    ArrayList<Ant> ants;
    private int id;
    private Colony(int id) {
        this.id = id;
        ants = new ArrayList<>();
    }

    public int getID() {
        return id;
    }
    
    
}
