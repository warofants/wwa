package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.base.console.command.ICommand;

class ReproduceCommand implements ICommand<ExampleController> {

    static final int PARENT_NAME_INDEX = 0;
    static final int CHILD_NAME_INDEX = 1;

    @Override
    public void execute(ExampleController controller, String[] arguments) {
        controller.reproduce(arguments);
    }
}
