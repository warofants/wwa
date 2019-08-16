package com.worldwarofants.game.logic.moves.antgroups;

public class AntGroup {
    private AntGroupType antGroupType;

    // TODO Ant Groups should be created with stats
    // ie size, c_health, c_attack, stored_food, etc
    public AntGroup(AntGroupType antGroupType) {
        this.antGroupType = antGroupType;
    }

    public AntGroupType getAntGroupType() {
        return antGroupType;
    }

    public enum AntGroupType {
        ATTACK,
        SCOUT,
        SCAVENGE
    }
}
