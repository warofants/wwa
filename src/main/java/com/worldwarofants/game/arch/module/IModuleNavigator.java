package com.worldwarofants.game.arch.module;

import com.worldwarofants.game.module.ModuleName;

/**
 * <p>
 * The ModuleNavigator is what Controllers use, to change the Modules of the game.
 * The way to do that, in any Controller method,
 * is to simply write <code> navigateTo(ModuleName.EXAMPLE); </code>
 * That would change the current Module in the game to the one you set it to. </p>
 * </p>
 *
 * @author Veradux
 */
public interface IModuleNavigator {

    /**
     * Use this method to change the current Module in the game.
     * Let's say for example that you wanted to go
     * from the ScoutingScreenController to the CombatScreenController.
     * To achieve that, you would need to use this method inside of the ScoutingController,
     * like this: <code> navigateTo(ModuleName.COMBAT) </code>
     */
    void navigateTo(ModuleName moduleName, String[] arguments);
}
