package com.worldwarofants.game.logic.world.entities;

import com.worldwarofants.game.logic.players.colony.Colony;
import com.worldwarofants.game.logic.world.WorldEntity;

public class WorldColonyWrapper extends WorldEntity {
    private Colony colony;

    public WorldColonyWrapper(int xPos, int yPos, int uid, Colony colony) {
        super(xPos, yPos, uid, EntityType.COLONY);
        this.colony = colony;
    }

    public Colony getColony() {
        return colony;
    }
}
