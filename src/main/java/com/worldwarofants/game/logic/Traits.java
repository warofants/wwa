package com.worldwarofants.game.logic;

import java.util.HashMap;
import java.util.Map;

import com.worldwarofants.game.logic.AntSpecies;

public class Traits {

    static Map<String, Class<? extends Traits>> traitMap = new HashMap<String, Class<? extends Traits>>();
    static {
        traitMap.put("casteless", Traits.casteless.class);
        traitMap.put("erroneous", Traits.erroneous.class);
    }

    static Traits getTrait(String trait) {
        Class<?> trait_class = traitMap.get(trait);
        try {
            return (Traits) trait_class.newInstance();
        }
        catch (Exception e) {
            System.out.println("Failed to get trait " + trait);
            e.printStackTrace();
            return null;
        }
    }

    public void Initialize(AntSpecies target) {}

    // Species with this trait shouldn't exist
    static class erroneous extends Traits {
        public void Initialize(AntSpecies target) {
            target.name = "!!" + target.name + "!!";
        }
    }

    // Casteless species do not have significant physical difference within the
    // species
    static class casteless extends Traits {
    }

}