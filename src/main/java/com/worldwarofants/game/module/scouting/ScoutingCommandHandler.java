package com.worldwarofants.game.module.scouting;

import java.util.Map;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;

public class ScoutingCommandHandler extends AbstractCommandHandler<ScoutingController> {
	public static final String COMMAND_SHOW_SCOUTING_SETUP_SCREEN = "showOptions";
	public static final String COMMAND_START_SCOUTING = "scout";
	
	public ScoutingCommandHandler(ScoutingController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<ScoutingController>> commands) {
		commands.put(COMMAND_SHOW_SCOUTING_SETUP_SCREEN, (controller, args) -> controller.showScoutingSetup());
		commands.put(COMMAND_START_SCOUTING, (controller, args) -> controller.startScouting());
	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		executeCommand(COMMAND_SHOW_SCOUTING_SETUP_SCREEN);
	}

}
