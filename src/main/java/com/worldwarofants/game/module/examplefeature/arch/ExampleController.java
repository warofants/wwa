package com.worldwarofants.game.module.examplefeature.arch;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.ExampleAnt;
import com.worldwarofants.game.service.AntsService;

import java.util.List;
import java.util.stream.Collectors;

class ExampleController extends AbstractController<ExampleView> {

    private AntsService antsService;

    ExampleController(ExampleView view, IModuleNavigator navigator, AntsService antsService) {
        super(view, navigator);
        this.antsService = antsService;
    }

    void reproduce(String[] arguments) {
        String parentName = arguments[ReproduceCommand.PARENT_NAME_INDEX];
        String childName = arguments[ReproduceCommand.CHILD_NAME_INDEX];

        ExampleAnt parent = antsService.findAntByName(parentName);
        ExampleAnt child = parent.reproduce(childName);
        antsService.addAnt(child);

        showAllAnts(arguments);
    }

    /**
     * This sets up the view model and updates the view
     */
    void showAllAnts(String[] arguments) {
        List<String> antNames = getAntNames(antsService.getAllAnts());
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
