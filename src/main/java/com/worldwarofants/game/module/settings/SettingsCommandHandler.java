package com.worldwarofants.game.module.settings;

import java.util.Map;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;

public class SettingsCommandHandler extends AbstractCommandHandler<SettingsController> {
	
	public static final String COMMAND_SHOW_SETTINGS_SCREEN = "showSettings";
	public static final String COMMAND_APPLY_CHANGES = "apply";
	
	public SettingsCommandHandler(SettingsController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<SettingsController>> commands) {
		commands.put(COMMAND_SHOW_SETTINGS_SCREEN, (controller, args) -> controller.showSettingsScreen());
		commands.put(COMMAND_APPLY_CHANGES, (controller, args) -> controller.applyChanges());
	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		executeCommand(COMMAND_SHOW_SETTINGS_SCREEN);
	}

}
