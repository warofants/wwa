package com.worldwarofants.game.module.combat;

import java.util.Map;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;

public class CombatCommandHandler extends AbstractCommandHandler<CombatController> {
	public static final String COMMAND_SHOW_COMBAT_SETUP_SCREEN = "showOptions";
	public static final String COMMAND_START_SKIRMISH = "skirmish";
	public static final String COMMAND_START_RAID = "raid";
	public static final String COMMAND_START_INVASION = "invade";
	
	public CombatCommandHandler(CombatController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<CombatController>> commands) {
		commands.put(COMMAND_SHOW_COMBAT_SETUP_SCREEN, (controller, args) -> controller.showCombatSetupScreen());
		commands.put(COMMAND_START_SKIRMISH, (controller, args) -> controller.startSkirmish());
		commands.put(COMMAND_START_RAID, (controller, args) -> controller.startRaid());
		commands.put(COMMAND_START_INVASION, (controller, args) -> controller.startInvasion());

	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		executeCommand(COMMAND_SHOW_COMBAT_SETUP_SCREEN);
	}

}
