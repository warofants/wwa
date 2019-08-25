package com.worldwarofants.game.module.homescreen;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;

public final class HomeScreenController extends AbstractController<HomeScreenView> {

	public HomeScreenController(HomeScreenView view, World world, IModuleNavigator navigator) {
		super(view, navigator);
	}
	
	public void showHomeScreen() {
		view.renderMainMenu();
	}
	
	public void showGameSetup() {
		System.out.println("showing game setup screen");
	}

	public void showSavedGames() {
		System.out.println("showing saved games");
	}

	public void exitGame() {
		System.out.println("exiting game");
	}
}
