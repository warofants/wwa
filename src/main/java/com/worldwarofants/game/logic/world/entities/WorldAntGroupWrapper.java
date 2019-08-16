package com.worldwarofants.game.logic.world.entities;

import com.worldwarofants.game.logic.moves.antgroups.AntGroup;
import com.worldwarofants.game.logic.world.WorldEntity;

public class WorldAntGroupWrapper extends WorldEntity {
    private AntGroup antGroup;

    public WorldAntGroupWrapper(int xPos, int yPos, int uid, AntGroup antGroup) {
        super(xPos, yPos, uid, EntityType.ANT_GROUP);
        this.antGroup = antGroup;
    }

    public AntGroup getAntGroup() {
        return antGroup;
    }
}
