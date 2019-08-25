package com.worldwarofants.game.module.newgame;

import java.util.Map;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;

public class NewGameCommandHandler extends AbstractCommandHandler<NewGameController> {
	
	public static final String COMMAND_SHOW_GAME_SETUP_SCREEN = "showGameSetup";
	public static final String COMMAND_SHOW_CHOOSE_SPECIES_SCREEN = "showChooseSpecies";
	public static final String COMMAND_START_NEW_GAME = "startGame";
	
	public NewGameCommandHandler(NewGameController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<NewGameController>> commands) {
		commands.put(COMMAND_SHOW_GAME_SETUP_SCREEN, (controller, args) -> controller.showGameSetupScreen());
	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		executeCommand(COMMAND_SHOW_GAME_SETUP_SCREEN);
	}
}
