package com.worldwarofants.game.module.startmenu;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;

public class StartMenuModule extends AbstractModule<StartMenuCommandHandler> {

	public StartMenuModule(World world, IModuleNavigator navigator) {
		super(world, navigator);
	}

	@Override
	protected StartMenuCommandHandler initDependencies() {
		StartMenuModel viewModel = new StartMenuModel();
		StartMenuView view = new StartMenuView(viewModel);
		StartMenuController controller = new StartMenuController(view, navigator);
		return new StartMenuCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.STARTMENU;
	}
}
