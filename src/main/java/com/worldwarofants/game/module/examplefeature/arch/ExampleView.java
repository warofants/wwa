package com.worldwarofants.game.module.examplefeature.arch;

import com.worldwarofants.game.arch.AbstractView;

class ExampleView extends AbstractView<ExampleViewModel> {

    // You can simply add "assets" to the game like this, as constants, in their respective view.
    // Because they will be simple text, there will not be a problem.
    // Also that way they will be divided by what screen they are used in.
    private static final String GAME_TITLE = "WORLD WAR OF ANTS";

    ExampleView(ExampleViewModel viewModel) {
        super(viewModel);
    }

    public void showAllAnts() {
        StringBuilder antsString = new StringBuilder();
        getViewModel().getAntNames().forEach(name -> antsString.append(name).append(", "));

        if (antsString.length() > 2) {
            String trimmedAntsString = antsString.toString().substring(0, antsString.length() - 2);
            System.out.println(trimmedAntsString);
        }
    }

    public void showGameTitle() {
        System.out.println(GAME_TITLE);
    }
}
