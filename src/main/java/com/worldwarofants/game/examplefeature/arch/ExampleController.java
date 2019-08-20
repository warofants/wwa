package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.base.AbstractController;
import com.worldwarofants.game.model.World;

class ExampleController extends AbstractController<ExampleView> {

    ExampleController(ExampleView view, World world) {
        super(view, world);
    }

    void showView(String[] arguments) {
        view.showExample(arguments);
//        world.a
    }
}
