package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.base.AbstractView;

class ExampleView extends AbstractView<ExampleViewModel> {

    public ExampleView(ExampleViewModel viewModel) {
        super(viewModel);
    }

    public void showExample(String[] args) {
        System.out.println("Example " + args[0]);
    }
}
