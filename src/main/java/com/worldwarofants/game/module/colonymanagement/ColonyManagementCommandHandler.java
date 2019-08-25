package com.worldwarofants.game.module.colonymanagement;

import java.util.Map;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;

public class ColonyManagementCommandHandler extends AbstractCommandHandler<ColonyManagementController> {
	public static final String COMMAND_SHOW_COLONY_MANAGEMENT_SCREEN = "manageColony";
	
	public ColonyManagementCommandHandler(ColonyManagementController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<ColonyManagementController>> commands) {
		commands.put(COMMAND_SHOW_COLONY_MANAGEMENT_SCREEN, (controller, args) -> controller.showColonyManagementScreen());
	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		executeCommand(COMMAND_SHOW_COLONY_MANAGEMENT_SCREEN);
	}

}
