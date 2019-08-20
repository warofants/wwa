package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.base.AbstractController;
import com.worldwarofants.game.model.World;

public class ExampleController extends AbstractController<ExampleView> {

    public ExampleController(ExampleView view, World world) {
        super(view, world);
    }

    public void showView(String[] arguments) {
        view.showExample(arguments);
    }
}
