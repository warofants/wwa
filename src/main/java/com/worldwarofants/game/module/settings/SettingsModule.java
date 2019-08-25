package com.worldwarofants.game.module.settings;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;

public class SettingsModule extends AbstractModule<SettingsCommandHandler> {

	public SettingsModule(World world, IModuleNavigator navigator) {
		super(world, navigator);
	}

	@Override
	protected SettingsCommandHandler initDependencies() {
		SettingsViewModel viewModel = new SettingsViewModel();
		SettingsView view = new SettingsView(viewModel);
		SettingsController controller = new SettingsController(view, navigator);
		return new SettingsCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.SETTINGS;
	}

}
