package com.worldwarofants.game.module.persistence;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;

public class PersistenceModule extends AbstractModule<PersistenceCommandHandler> {

	public PersistenceModule(World world, IModuleNavigator navigator) {
		super(world, navigator);
	}

	@Override
	protected PersistenceCommandHandler initDependencies() {
		PersistenceViewModel viewModel = new PersistenceViewModel();
		PersistenceView view = new PersistenceView(viewModel);
		PersistenceController controller = new PersistenceController(view, navigator);
		return new PersistenceCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.PERSISTENCE;
	}

}
