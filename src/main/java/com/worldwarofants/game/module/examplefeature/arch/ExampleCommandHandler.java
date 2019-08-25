package com.worldwarofants.game.module.examplefeature.arch;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;

import java.util.Map;

import static com.worldwarofants.game.ConsoleGame.COMMAND_SHOW_GAME_TITLE;

class ExampleCommandHandler extends AbstractCommandHandler<ExampleController> {

    private static final String COMMAND_SHOW_ANTS = "showAnts";

    ExampleCommandHandler(ExampleController controller) {
        super(controller);
    }

    @Override
    protected void defineCommands(Map<String, ICommand<ExampleController>> commands) {
        commands.put(COMMAND_SHOW_GAME_TITLE, (ExampleController::gameTitle));
        commands.put(COMMAND_SHOW_ANTS, (ExampleController::showAllAnts));
        commands.put(ReproduceCommand.COMMAND_NAME, new ReproduceCommand());
    }

    @Override
    public void executeStartingCommand(String[] arguments) {
        executeCommand(COMMAND_SHOW_GAME_TITLE, arguments);
    }
}
