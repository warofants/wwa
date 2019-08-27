package com.worldwarofants.game.module.examplefeature.arch;

import com.worldwarofants.game.arch.console.command.ICommand;

class ReproduceCommand implements ICommand<ExampleController> {

    static final String COMMAND_NAME = "reproduce";
    static final int PARENT_NAME_INDEX = 0;
    static final int CHILD_NAME_INDEX = 1;

    @Override
    public void execute(ExampleController controller, String[] arguments) {
        controller.reproduce(arguments);
    }
}
