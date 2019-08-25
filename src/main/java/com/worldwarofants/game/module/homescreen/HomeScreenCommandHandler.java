package com.worldwarofants.game.module.homescreen;

import java.util.Map;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;

public class HomeScreenCommandHandler extends AbstractCommandHandler<HomeScreenController> {
	public static final String COMMAND_SHOW_HOME_SCREEN = "showHome";
	public static final String COMMAND_NEW_GAME = "newGame";
	public static final String COMMAND_LOAD_GAME = "loadGame";
	public static final String COMMAND_EXIT= "exitGame";
	
	
	public HomeScreenCommandHandler(HomeScreenController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<HomeScreenController>> commands) {
		commands.put(COMMAND_SHOW_HOME_SCREEN, (controller, args) -> controller.showHomeScreen());
		commands.put(COMMAND_NEW_GAME, (controller, args) -> controller.showGameSetup());
		commands.put(COMMAND_LOAD_GAME, (controller, args) -> controller.showSavedGames());
		commands.put(COMMAND_EXIT, (controller, args) -> controller.exitGame());
	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		executeCommand(COMMAND_SHOW_HOME_SCREEN);
	}

}
