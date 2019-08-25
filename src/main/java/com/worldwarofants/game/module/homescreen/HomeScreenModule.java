package com.worldwarofants.game.module.homescreen;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;

public class HomeScreenModule extends AbstractModule<HomeScreenCommandHandler> {

	public HomeScreenModule(World world, IModuleNavigator navigator) {
		super(world, navigator);
	}

	@Override
	protected HomeScreenCommandHandler initDependencies() {
		HomeScreenViewModel viewModel = new HomeScreenViewModel();
		HomeScreenView view = new HomeScreenView(viewModel);
		HomeScreenController controller = new HomeScreenController(view, world, navigator);
		return new HomeScreenCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.HOMESCREEN;
	}

}
