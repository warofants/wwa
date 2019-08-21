package com.worldwarofants.game.arch.module;

import java.util.Map;
import java.util.TreeMap;

/**
 * The ModuleManager is what keeps all of the Modules in one place.
 * It is the class which also changes the current Module the player is interacting with.
 * That is done using <code> navigateTo(moduleName); </code> in the Controllers.
 *
 * @see AbstractModule
 * @see IModuleNavigator
 *
 * @author Veradux
 */
public abstract class ModuleManager {

    private final Map<ModuleName, AbstractModule> modules;
    protected AbstractModule currentModule;

    protected ModuleManager() {
        modules = new TreeMap<>();
        IModuleNavigator moduleNavigator = (moduleName -> currentModule = modules.get(moduleName));
        currentModule = defineStartingModule(moduleNavigator);
        defineModules(moduleNavigator);
        addModule(currentModule);
    }

    /**
     * Whenever a new module is created, it should be added in the game through this method.
     * That is done using <code>addModule(new Module())</code>.
     * Remember, adding the starting Module here is not necessary.
     */
    protected abstract void defineModules(IModuleNavigator navigator);

    /**
     * This method is used to set up the module from which the game starts.
     * You do not have to use <code> addModule(new Module()); </code>
     * before returning the starting module.
     * Because that is already done for you.
     */
    protected abstract AbstractModule defineStartingModule(IModuleNavigator navigator);

    protected void addModule(AbstractModule module) {
        modules.put(module.getModuleName(), module);
    }
}
