package com.worldwarofants.game.module.newgame;

import java.util.Map;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;
import com.worldwarofants.game.module.ModuleName;

public class NewGameCommandHandler extends AbstractCommandHandler<NewGameController> {
	
	public static final String COMMAND_SHOW_NEW_GAME_SCREEN = "show";
	public static final String COMMAND_START_NEW_GAME = "start";
	public static final String COMMAND_BACK = "back";

	public NewGameCommandHandler(NewGameController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<NewGameController>> commands) {
		commands.put(COMMAND_SHOW_NEW_GAME_SCREEN, (controller, args) -> controller.showNewGameScreen());
		commands.put(COMMAND_START_NEW_GAME, (controller, args) -> controller.startNewGame());
		commands.put(COMMAND_BACK, (controller, args) -> controller.back());
	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		executeCommand(COMMAND_SHOW_NEW_GAME_SCREEN);
	}
}
