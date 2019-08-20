package com.worldwarofants.game.arch.module;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.model.World;

/**
 * TODO add docs
 * @param <CommandHandler>
 * @author Veradux
 */
public abstract class AbstractModule<CommandHandler extends AbstractCommandHandler> {

    private CommandHandler commandHandler;
    protected World world;
    protected ModuleNavigator navigator;

    public AbstractModule(World world, ModuleNavigator navigator) {
        this.world = world;
        this.navigator = navigator;
        commandHandler = initDependencies();
    }

    public void executeCommand(String input) {
        commandHandler.executeCommand(input);
    }

    protected abstract CommandHandler initDependencies();

    public abstract ModuleName getModuleName();
}
