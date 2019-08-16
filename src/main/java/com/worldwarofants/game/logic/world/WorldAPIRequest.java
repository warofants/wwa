package com.worldwarofants.game.logic.world;

public class WorldEvent {
    WorldEventType type;

    enum WorldEventType {
        DELETEENTITY,
        POSTENTITY,
        PUTENTITY,
    }
}
