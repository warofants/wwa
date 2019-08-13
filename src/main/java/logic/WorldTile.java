package main.java.logic;

/*
 * A class meant to represent a tile in the "World."
 * Tiles may contain an entity [such as an ant or resource],
 * or simply be left empty.
 * Mostly meant to compartmentilaze World Data.
 *
 */
public class WorldTile {
    private Entity localEntity;
    public WorldTile() {

    }
    // Copy constructor
    public WorldTile(WorldTile toCopy) {
        localEntity = toCopy.getEntity();
    }
    public boolean hasEntity() {
        return localEntity != null;
    }
    public Entity getEntity() {
        return new Entity(localEntity);
    }
    public void setEntity(Entity newEntity) {
        localEntitiy = newEntity;
    }
}
