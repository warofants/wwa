package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.arch.AbstractView;

class ExampleView extends AbstractView<ExampleViewModel> {

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
}
