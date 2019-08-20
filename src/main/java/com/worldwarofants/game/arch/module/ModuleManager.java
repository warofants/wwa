package com.worldwarofants.game.arch.module;

import java.util.Map;
import java.util.TreeMap;

public abstract class ModuleManager implements ModuleNavigator {

    private Map<ModuleName, AbstractModule> modules;
    protected AbstractModule currentModule;

    protected ModuleManager() {
        modules = new TreeMap<>();
        defineModules();
        currentModule = defineStartingModule();
        addModule(currentModule);
    }

    /**
     * Whenever a new module is created, it should be added in the game through this method.
     * That is done using <code>addModule(new Module())</code>.
     * Remember, adding the starting Module here is not necessary.
     */
    protected abstract void defineModules();

    /**
     * This method is used to set up the module from which the game starts.
     * You do not have to use <code>addModule(new Module())</code>,
     * before returning the starting module.
     * Because that is already done for you.
     */
    protected abstract AbstractModule defineStartingModule();

    protected void addModule(AbstractModule module) {
        modules.put(module.getModuleName(), module);
    }

    @Override
    public void navigateTo(ModuleName moduleName) {
        currentModule = modules.get(moduleName);
    }
}
