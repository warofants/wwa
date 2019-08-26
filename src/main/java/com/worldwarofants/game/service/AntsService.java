package com.worldwarofants.game.service;

import com.worldwarofants.game.model.ExampleAnt;
import com.worldwarofants.game.model.World;

import java.util.Collections;
import java.util.List;

/**
 * <p>This is an example Service class.
 * The purpose of it is to be used by the Controllers to access specific info from the world. </p>
 * <p>
 * Services should not be split logically like the rest of the components.
 * They should be split by what they access from the World.
 * Because the Service classes will be reused between Modules.
 * One Controller can have access to many Services, or it can have access to none at all. </p>
 *
 * @see com.worldwarofants.game.arch.AbstractController
 */
public class AntsService {

    public AntsService(World world) {

    }

    public ExampleAnt findAntByName(String parentName) {
        return new ExampleAnt(parentName);
    }

    public void addAnt(ExampleAnt child) {

    }

    public List<ExampleAnt> getAllAnts() {
        return Collections.emptyList();
    }
}
