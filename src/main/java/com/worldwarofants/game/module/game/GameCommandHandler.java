package com.worldwarofants.game.module.game;

import java.util.Map;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;

public class GameCommandHandler extends AbstractCommandHandler<GameController> {
	public static final String COMMAND_SHOW_GAME_SCREEN = "showGameScreen"; 
	public static final String COMMAND_SHOW_GAME_OPTIONS = "showGameOptions";
	public static final String COMMAND_START_SCOUTING = "scout";
	public static final String COMMAND_START_COMBAT = "combat";
	public static final String COMMAND_START_COLONY_MANAGEMENT = "manageColony";
	
	public GameCommandHandler(GameController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<GameController>> commands) {
		commands.put(COMMAND_SHOW_GAME_SCREEN, (controller, args) -> controller.showGameScreen());
		commands.put(COMMAND_SHOW_GAME_OPTIONS, (controller, args) -> controller.showGameOptions());
		commands.put(COMMAND_START_SCOUTING, (controller, args) -> controller.startScouting());
		commands.put(COMMAND_START_COMBAT, (controller, args) -> controller.startCombat());
		commands.put(COMMAND_START_COLONY_MANAGEMENT, (controller, args) -> controller.startColonyManagement());
	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		executeCommand(COMMAND_SHOW_GAME_SCREEN);
	}

}
