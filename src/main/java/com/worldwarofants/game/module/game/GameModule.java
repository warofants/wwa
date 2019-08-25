package com.worldwarofants.game.module.game;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;

public class GameModule extends AbstractModule<GameCommandHandler> {

	public GameModule(World world, IModuleNavigator navigator) {
		super(world, navigator);
	}

	@Override
	protected GameCommandHandler initDependencies() {
		GameViewModel viewModel = new GameViewModel();
		GameView view = new GameView(viewModel);
		GameController controller = new GameController(view, navigator);
		return new GameCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.GAME;
	}
}
