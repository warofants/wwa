package com.worldwarofants.game.module.settings;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;

public class SettingsController extends AbstractController<SettingsView> {

	public SettingsController(SettingsView view, IModuleNavigator navigator) {
		super(view, navigator);
	}

	public void showSettingsScreen() {
		// TODO show settings screen
	}

	public void applyChanges() {
		// TODO save changes and exit settings
	}

}
