package com.worldwarofants.game.arch;

import com.worldwarofants.game.arch.console.command.ICommand;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.module.ModuleName;

/**
 * <p> The Controller is the bridge between the World class and what the player will see on the screen.
 * It is responsible for getting what is needed from the World through Services, and passing it to the view.
 * The way it is passed to the view, is through the view's viewModel. </p>
 * <p>
 *  The way the controller's methods are used is through player Commands.
 *  Each command should be responsible for one method. </p>
 *  <p>
 *  Note that even if the command does not have arguments,
 *  the controller method must still have the String[] arguments parameter. </p>
 *
 * @see AbstractView
 * @see ICommand
 * @author Veradux
 */
public abstract class AbstractController<View extends AbstractView> {

    private final IModuleNavigator moduleNavigator;
    protected final View view;

    public AbstractController(View view, IModuleNavigator navigator) {
        this.view = view;
        this.moduleNavigator = navigator;
    }

    /**
     * Use this method to change the current Module in the game.
     * Let's say for example that you wanted to go from
     * the ScoutingScreenController to the CombatScreenController.
     * To achieve that, you would need to use this method inside of the ScoutingController,
     * like this: <code> navigateTo(ModuleName.COMBAT, arguments) </code>
     *
     * @see IModuleNavigator
     */
    protected void navigateTo(ModuleName moduleName, String[] arguments) {
        moduleNavigator.navigateTo(moduleName, arguments);
    }
}
