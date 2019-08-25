package com.worldwarofants.game.module.colonymanagement;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;

public class ColonyManagementModule extends AbstractModule<ColonyManagementCommandHandler> {

	public ColonyManagementModule(World world, IModuleNavigator navigator) {
		super(world, navigator);
	}

	@Override
	protected ColonyManagementCommandHandler initDependencies() {
		ColonyManagementViewModel viewModel = new ColonyManagementViewModel();
		ColonyManagementView view = new ColonyManagementView(viewModel);
		ColonyManagementController controller = new ColonyManagementController(view, navigator);
		return new ColonyManagementCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.COLONY_MANAGEMENT;
	}

}
