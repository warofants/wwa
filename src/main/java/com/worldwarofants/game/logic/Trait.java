package com.worldwarofants.game.logic;

import java.util.HashMap;
import java.util.Map;

import com.worldwarofants.game.logic.AntSpecies;

public class Trait {

    static private Map<String,Class<? extends Trait>> traits = new HashMap<String,Class<? extends Trait>>();
    static {
        traits.put("casteless", Trait.Casteless.class);
        traits.put("erroneous", Trait.Erroneous.class);
    }

    static Trait getTrait(String trait) {
        Class<? extends Trait> trait_class = traits.get(trait);
        try {
            return (Trait) trait_class.newInstance();
        }
        catch (Exception e) {
            System.out.println("Failed to get trait " + trait);
            e.printStackTrace();
            return null;
        }
    }

    public void initialize(AntSpecies target) {}

    // TRAITS BEGIN HERE //

    // Species with this trait shouldn't exist in normal gameplay
    static class Erroneous extends Trait {
        public void initialize(AntSpecies target) {
            target.name = "!!" + target.name + "!!";
        }
    }

    // Casteless species do not have significant physical difference within the species
    static class Casteless extends Trait {
    }

}