package com.worldwarofants.game.module.game;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;

public class GameController extends AbstractController<GameView> {

	public GameController(GameView view, IModuleNavigator navigator) {
		super(view, navigator);
	}

	public void showGameScreen() {
		//TODO show main game screen
	}

	public void showGameOptions() {
		// TODO show game options
	}

	public void startScouting() {
		// TODO navigate to scouting module
	}

	public void startCombat() {
		// TODO navigate to combat module
	}
	
	public void startColonyManagement() {
		//TODO navigate to colony management module
	}
}
