package com.worldwarofants.game.base;

import com.worldwarofants.game.base.console.command.AbstractCommandHandler;
import com.worldwarofants.game.model.World;

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
}
