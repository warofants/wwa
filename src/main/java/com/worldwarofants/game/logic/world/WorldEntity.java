package com.worldwarofants.game.logic.world;

public class WorldEntity {
    private int posX, posY, uid;
    private EntityType type;

    public WorldEntity(int posX, int posY, int uid, EntityType type) {
        this.posX = posX;
        this.posY = posY;
        this.uid = uid;
        this.type = type;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getUid() {
        return uid;
    }

    /**
     * Only World class should be able to change uid
     * @param uid unique idea to set
     */
    void setUid(int uid) {
        this.uid = uid;
    }

    void setPosX(int posX) {
        this.posX = posX;
    }

    void setPosY(int posY) {
        this.posY = posY;
    }

    public EntityType getType() {
        return type;
    }

    public enum EntityType {
        NONE,
        ANT_GROUP,
        COLONY
    }
}
