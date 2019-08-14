import java.util.List;
import main.java.logic.Entity;
//TODO: Allow scrolling
//TODO: Construction of GameMap
/**
 * Contains the state of the game map
 * @version 1.1
 */
class GameMap {
    private short numRows, numCols;
    private int[][] fullMap;
    private int[][] userView;
    private List<Entity> entities;

    public GameMap() {}

    /**
     * Add an entity to the internal list of entities
     * @param entity
     */
    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    /**
     * Method that prints out the game map
     */
    public void printMap() {

    }

    /**
     * Method that places entites from entities list on the map
     */
    private void placeEntities() {

    }

}
