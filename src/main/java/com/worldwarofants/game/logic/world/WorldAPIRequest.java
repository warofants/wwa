package com.worldwarofants.game.logic.world;

public class WorldAPIRequest {
    private WorldEventType type;
    private WorldEntity entity;

    public WorldAPIRequest(WorldEventType type, WorldEntity entity) {
        this.type = type;
        this.entity = entity;
    }

    public enum WorldEventType {
        DELETE_ENTITY,
        ADD_ENTITY,
        PUT_ENTITY,
    }

    public WorldEventType getType() {
        return type;
    }

    public WorldEntity getEntity() {
        return entity;
    }

    @Override
    public String toString() {
        return "WorldAPIRequest{" +
                "type=" + type +
                ", entity=" + entity +
                '}';
    }
}
