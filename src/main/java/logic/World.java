package main.java.logic;

import java.util.ArrayList;
import java.util.List;


/**
 * Class that handles all location specific data (ie unit collisions)
 */
public class World {
    private List<WorldTile> worldMap;
    private int width;
    private int height;

    public World(int width, int height) {
        worldMap = new ArrayList<WorldTile>();
	for (int i = 0; i < width * height; i++) {
            worldMap.add(new WorldTile());
	}
    }
    
    

    public void addQueen(int x, int y, int playerID) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("World::addQueen is unimplemented!");
    }
    
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
     
    public WorldTile getTile(int x, int y) {
        return new WorldTile(worldMap.get(x + y * width));
    }


    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public void setTile(int x, int y, WorldTile tile) {
        worldMap.set(x + y * width, tile);
    }
}
