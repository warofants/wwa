package com.worldwarofants.game.module.newgame;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;

public class NewGameController extends AbstractController<NewGameView> {

	public NewGameController(NewGameView view, IModuleNavigator navigator) {
		super(view, navigator);
	}

	public void showGameSetupScreen() {
		//TODO show new game setup screen
	}

	public void showChooseSpeciesScreen() {
		//TODO let user choose species
	}
	
	public void startNewGame() {
		//TODO navigate to game module 
	}
}
