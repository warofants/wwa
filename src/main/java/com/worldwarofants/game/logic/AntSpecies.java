package com.worldwarofants.game.logic;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import com.worldwarofants.game.logic.Traits;

/* 
    A class for a single species of ant, made up of different traits.
    Its goal is to take a string as its constructor argument, find
    the block with the same name and collect the data provided.

*/

public class AntSpecies {

    String name, name_latin, description;
    int health, attack, defense;
    ArrayList<Traits> traits = new ArrayList<>();

    public AntSpecies(String species) {
        Parser parser = new Parser();
        Map<String, Object> data = parser.getSpeciesData(species);

        this.name = data.get("name").toString();
        this.name_latin = data.get("name_latin").toString();
        this.description = data.get("description").toString();
        
        this.health = (int) data.get("health");
        this.attack = (int) data.get("attack");
        this.defense = (int) data.get("defense");

        ArrayList<?> traitList = (data.get("traits") instanceof ArrayList<?> ? (ArrayList<?>) data.get("traits") : null);
        if(traitList.size() > 0 && traitList.get(0) instanceof String) {
            for(Object obj: traitList) {
                traits.add(Traits.getTrait(obj.toString()));
            }
        }

        InitializeTraits();
    }

    void InitializeTraits() {
        for (Traits trait: this.traits) {
                trait.Initialize(this);
        }
    }
}

class Parser {
    Map<String, Map<String, Object>> data;

    Parser() {
        Yaml yaml = new Yaml();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("gamedata/species.yml");
        this.data = yaml.load(inputStream);
    }

    // Return only the key
    Map<String, Object> getSpeciesData(String species) {
        return this.data.get(species);
    }

    // Return everything that Parser has loaded
    Map<String, Map<String, Object>> getAllParsedData() {
        return this.data;
    }

}