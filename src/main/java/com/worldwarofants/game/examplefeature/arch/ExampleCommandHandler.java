package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.base.console.command.AbstractCommandHandler;
import com.worldwarofants.game.base.console.command.ICommand;

import java.util.Map;

class ExampleCommandHandler extends AbstractCommandHandler<ExampleController> {

    private static final String EXAMPLE_COMMAND_NAME = "example";

    ExampleCommandHandler(ExampleController controller) {
        super(controller);
    }

    @Override
    protected void defineCommands(Map<String, ICommand<ExampleController>> commands) {
        commands.put(EXAMPLE_COMMAND_NAME, (ExampleController::showView));
    }

}
