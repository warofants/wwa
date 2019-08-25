package com.worldwarofants.game.module.scouting;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;

public class ScoutingController extends AbstractController<ScoutingView> {

	public ScoutingController(ScoutingView view, IModuleNavigator navigator) {
		super(view, navigator);
	}

	public void showScoutingSetup() {
		// TODO show scouting setup screen
	}

	public void startScouting() {
		// TODO process scouting and show result
	}
}
