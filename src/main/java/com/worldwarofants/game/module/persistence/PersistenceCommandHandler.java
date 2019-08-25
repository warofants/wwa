package com.worldwarofants.game.module.persistence;

import java.util.Map;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;

public class PersistenceCommandHandler extends AbstractCommandHandler<PersistenceController> {

	public static final String COMMAND_SHOW_SAVED_GAMES = "showSaved";
	public static final String COMMAND_SAVE_CURRENT_STATE = "saveState";
	public static final String COMMAND_LOAD_SAVED_STATE = "loadState";
	
	public PersistenceCommandHandler(PersistenceController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<PersistenceController>> commands) {
		commands.put(COMMAND_SHOW_SAVED_GAMES, (controller, args) -> controller.showSavedGamesScreen());
		commands.put(COMMAND_SAVE_CURRENT_STATE, (controller, args) -> controller.saveCurrentState());
		commands.put(COMMAND_LOAD_SAVED_STATE, (controller, args) -> controller.loadSavedState(args[0]));
	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		executeCommand(COMMAND_SHOW_SAVED_GAMES);
	}

}
