package com.worldwarofants.game.module.startmenu;

import java.util.Map;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;

public class StartMenuCommandHandler extends AbstractCommandHandler<StartMenuController> {
	
	public static final String COMMAND_SHOW_START_MENU_SCREEN = "show"; 
	public static final String COMMAND_NEW_GAME = "new";
	public static final String COMMAND_EXIT_GAME = "exit";
	
	public StartMenuCommandHandler(StartMenuController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<StartMenuController>> commands) {
		commands.put(COMMAND_SHOW_START_MENU_SCREEN, (controller, args) -> controller.showStartMenu());
		commands.put(COMMAND_NEW_GAME, (controller, args) -> controller.navigateToNewGameModule());
		commands.put(COMMAND_EXIT_GAME, (controller, args) -> controller.exitGame());
	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		executeCommand(COMMAND_SHOW_START_MENU_SCREEN);
	}

}
