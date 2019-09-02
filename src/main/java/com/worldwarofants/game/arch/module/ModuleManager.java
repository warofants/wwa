package com.worldwarofants.game.arch.module;

import com.worldwarofants.game.module.ModuleName;

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
        initDatabase();
        IModuleNavigator moduleNavigator = initNavigator();
        currentModule = defineStartingModule(moduleNavigator);
        defineModules(moduleNavigator);
        addModule(currentModule);
    }

    /**
     * Create the World here, and save it to a property.
     * This allows the World be created before the other objects
     * that depend on the World are created.
     */
    protected abstract void initDatabase();

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

    private IModuleNavigator initNavigator() {
        return (moduleName, arguments) -> {
            currentModule = modules.get(moduleName);
            currentModule.start(arguments);
        };
    }
}
