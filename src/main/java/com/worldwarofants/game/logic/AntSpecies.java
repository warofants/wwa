package com.worldwarofants.game.logic;

import java.util.ArrayList;
import java.util.Map;

import com.worldwarofants.game.logic.Trait;
import com.worldwarofants.game.util.YamlParser;

/**
* A class for a single species of ant, made up of different traits.
* Its goal is to take a string as its constructor argument, find
* the block with the same name and collect the data provided.
**/

public class AntSpecies {

    String name;
    String nameLatin;
    String description;
    int health;
    int attack;
    int defense;

    ArrayList<Trait> traits = new ArrayList<>();

    public AntSpecies(String species) {
        YamlParser parser = new YamlParser("gamedata/species.yml");
        Map<String, Object> data = parser.getDataByKey(species);

        this.name = data.get("name").toString();
        this.nameLatin = data.get("name_latin").toString();
        this.description = data.get("description").toString();
        
        this.health = (int) data.get("health");
        this.attack = (int) data.get("attack");
        this.defense = (int) data.get("defense");

        ArrayList<?> traitList = (data.get("traits") instanceof ArrayList<?> ? (ArrayList<?>) data.get("traits") : null);
        if(traitList.size() > 0 && traitList.get(0) instanceof String) {
            for(Object obj: traitList) {
                traits.add(Trait.getTrait(obj.toString()));
            }
        }

        InitializeTraits();
        System.out.println(this.name);
    }

    void InitializeTraits() {
        for (Trait trait: this.traits) {
                trait.initialize(this);
        }
    }
}