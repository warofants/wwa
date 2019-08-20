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

    public AbstractModule(World world) {
        this.world = world;
        commandHandler = initDependencies();
    }

    public void executeCommand(String input) {
        commandHandler.executeCommand(input);
    }

    protected abstract CommandHandler initDependencies();

    public abstract String getModuleName();
}
