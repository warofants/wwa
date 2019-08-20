package com.worldwarofants.game.arch;

import com.worldwarofants.game.arch.console.command.ICommand;
import com.worldwarofants.game.arch.module.ModuleNavigator;
import com.worldwarofants.game.arch.module.ModuleName;
import com.worldwarofants.game.model.World;

/**
 * <p> The Controller is the bridge between the World class and what the player will see on the screen.
 * It is responsible for getting what is needed from the World, and passing it to the view.
 * The way it is passed to the view, is through the view's viewModel. </p>
 * <p>
 *  The way the controller's methods are used is through player Commands.
 *  Each command should be responsible for one method. </p>
 *
 * @see ICommand
 * @author Veradux
 */
public abstract class AbstractController<View extends AbstractView> {

    private ModuleNavigator moduleNavigator;
    protected World world;
    protected View view;

    public AbstractController(View view, World world, ModuleNavigator navigator) {
        this.world = world;
        this.view = view;
        this.moduleNavigator = navigator;
    }

    /**
     * Use this method to change the current Module in the game.
     * Let's say for example that you wanted to go
     * from the ScoutingScreenController to the CombatScreenController.
     * To achieve that, you would need to use this method inside of the ScoutingController,
     * like this: <code> navigateTo(ModuleName.COMBAT) </code>
     */
    protected void navigateTo(ModuleName moduleName) {
        moduleNavigator.navigateTo(moduleName);
    }
}
