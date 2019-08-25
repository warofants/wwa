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
	
	public void startSkirmish() {
		//TODO navigate to skirmish module
	}
	
	public void startRaid() {
		//TODO navigate to raid module
	}
	
	public void startInvasion() {
		//TODO navigate to invasion module
	}
	
	public void startColonyManagement() {
		//TODO navigate to colony management module
	}
}
