package com.worldwarofants.game.module.combat;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;

public class CombatModule extends AbstractModule<CombatCommandHandler> {

	public CombatModule(World world, IModuleNavigator navigator) {
		super(world, navigator);
	}

	@Override
	protected CombatCommandHandler initDependencies() {
		CombatViewModel viewModel = new CombatViewModel();
		CombatView view = new CombatView(viewModel);
		CombatController controller = new CombatController(view, navigator);
		return new CombatCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.COMBAT;
	}

}
