package com.worldwarofants.game.module.newgame;

import com.worldwarofants.game.arch.AbstractView;

public class NewGameView extends AbstractView<NewGameViewModel> {

	public NewGameView(NewGameViewModel viewModel) {
		super(viewModel);
	}

	public void renderNewGameView() {
		line_break();
		spell("-- GAME SETUP --");
		line_break();
		post("* Start Game - 'startGame'");
		post("* Species Selection - 'Not Available'");
		post("* Back - 'back'");
		line_break();;
		post("Please enter your command:");
	}
}
