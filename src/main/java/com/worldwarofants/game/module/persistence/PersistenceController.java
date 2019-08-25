package com.worldwarofants.game.module.persistence;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;

public class PersistenceController extends AbstractController<PersistenceView> {

	public PersistenceController(PersistenceView view, IModuleNavigator navigator) {
		super(view, navigator);
	}

	public void showSavedGamesScreen() {
		//TODO show saved games screen
	}

	public void saveCurrentState() {
		// TODO save current state
	}

	public void loadSavedState(String savedInstanceIdentifier) {
		// TODO load saved state and switch to game module
	}

}
