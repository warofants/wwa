package com.worldwarofants.game.module.scouting;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;

public class ScoutingModule extends AbstractModule<ScoutingCommandHandler> {

	public ScoutingModule(World world, IModuleNavigator navigator) {
		super(world, navigator);
	}

	@Override
	protected ScoutingCommandHandler initDependencies() {
		ScoutingViewModel viewModel = new ScoutingViewModel();
		ScoutingView view = new ScoutingView(viewModel);
		ScoutingController controller = new ScoutingController(view, navigator);
		return new ScoutingCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.SCOUTING;
	}

}
