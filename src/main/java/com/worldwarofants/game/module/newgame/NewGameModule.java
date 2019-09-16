package com.worldwarofants.game.module.newgame;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;

public class NewGameModule extends AbstractModule<NewGameCommandHandler> {

	public NewGameModule(World world, IModuleNavigator navigator) {
		super(world, navigator);
	}

	@Override
	protected NewGameCommandHandler initDependencies() {
		NewGameViewModel viewModel = new NewGameViewModel();
		NewGameView view = new NewGameView(viewModel);
		NewGameController controller = new NewGameController(view, navigator);
		return new NewGameCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.NEW_GAME;
	}

}
