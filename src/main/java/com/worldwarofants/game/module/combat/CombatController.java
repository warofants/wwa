package com.worldwarofants.game.module.combat;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;

public class CombatController extends AbstractController<CombatView> {

	public CombatController(CombatView view, IModuleNavigator navigator) {
		super(view, navigator);
	}

	public void showCombatSetupScreen() {
		// TODO show combat setup screen
	}

	public void startSkirmish() {
		//TODO process skirmish and show result
	}
	
	public void startRaid() {
		//TODO process raid and show result
	}
	
	public void startInvasion() {
		//TODO process invasion and show result
	}
}
