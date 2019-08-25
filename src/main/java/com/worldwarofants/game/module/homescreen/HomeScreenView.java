package com.worldwarofants.game.module.homescreen;

import com.worldwarofants.game.arch.AbstractView;

public class HomeScreenView extends AbstractView<HomeScreenViewModel> {
	
	public HomeScreenView(HomeScreenViewModel viewModel) {
		super(viewModel);
	}

	public void renderMainMenu() {
		System.out.println("-- WORLD WAR OF ANTS --");
		System.out.println();
		System.out.println("* New Game - 'newGame'");
		System.out.println("* Load Game - 'loadGame'");
		System.out.println("* Exit - 'exitGame'");
		System.out.println();
		System.out.println("Please enter your command:");
	}
}
