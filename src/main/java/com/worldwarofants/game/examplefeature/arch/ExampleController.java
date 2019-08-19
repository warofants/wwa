package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.base.AbstractController;

public class ExampleController extends AbstractController<ExampleView> {

    public ExampleController(ExampleView view) {
        super(view);
    }

    public void showView() {
        view.show();
    }
}
