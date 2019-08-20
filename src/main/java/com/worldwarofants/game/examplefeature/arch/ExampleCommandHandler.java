package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;

import java.util.Map;

class ExampleCommandHandler extends AbstractCommandHandler<ExampleController> {

    private static final String COMMAND_SHOW_ANTS = "showAnts";

    ExampleCommandHandler(ExampleController controller) {
        super(controller);
    }

    @Override
    protected void defineCommands(Map<String, ICommand<ExampleController>> commands) {
        commands.put(COMMAND_SHOW_ANTS, (ExampleController::showAllAnts));
        commands.put(ReproduceCommand.COMMAND_NAME, new ReproduceCommand());
    }
}
