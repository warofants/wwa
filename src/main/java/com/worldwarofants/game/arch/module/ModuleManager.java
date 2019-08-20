package com.worldwarofants.game.arch.module;

import java.util.Map;
import java.util.TreeMap;

public abstract class ModuleManager implements Navigator {

    private Map<String, AbstractModule> modules;
    protected AbstractModule currentModule;

    protected ModuleManager() {
        modules = new TreeMap<>();
        currentModule = defineStartingModule();
        addModule(currentModule);
    }

    public abstract AbstractModule defineStartingModule();

    protected void addModule(AbstractModule module) {
        modules.put(module.getModuleName(), module);
    }

    @Override
    public void navigateTo(String moduleName) {
        currentModule = modules.get(moduleName);
    }
}
