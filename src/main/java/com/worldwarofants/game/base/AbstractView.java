package com.worldwarofants.game.base;

/**
 * Views are the classes responsible for interacting with the console.
 * They mainly print and read.
 * Views should preferably be used only in the Controller classes.
 * If possible, separate views by "screens"/stages of the game.
 * For example, HomeScreenView, SettingsScreenView, ScoutingScreenView.
 *
 * @author Veradux
 */
public abstract class AbstractView<VM extends AbstractViewModel> {

    protected VM viewModel;

    public AbstractView(VM viewModel) {
        this.viewModel = viewModel;
    }
}
