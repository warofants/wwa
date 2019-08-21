package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.ExampleAnt;
import com.worldwarofants.game.model.World;

import java.util.List;
import java.util.stream.Collectors;

class ExampleController extends AbstractController<ExampleView> {

    ExampleController(ExampleView view, World world, IModuleNavigator navigator) {
        super(view, world, navigator);
    }

    void reproduce(String[] arguments) {
        String parentName = arguments[ReproduceCommand.PARENT_NAME_INDEX];
        String childName = arguments[ReproduceCommand.CHILD_NAME_INDEX];

        ExampleAnt parent = world.findAntByName(parentName);
        ExampleAnt child = parent.reproduce(childName);
        world.addAnt(child);

        showAllAnts(arguments);
    }

    /**
     * This sets up the view model and updates the view
     */
    void showAllAnts(String[] arguments) {
        List<String> antNames = getAntNames(world.getAllAnts());
        view.getViewModel().setAntNames(antNames);
        view.showAllAnts();
    }

    void gameTitle(String[] arguments) {
        view.showGameTitle();
    }

    private List<String> getAntNames(List<ExampleAnt> ants) {
        return ants.stream()
                .map(ExampleAnt::getName)
                .collect(Collectors.toList());
    }
}
