package com.worldwarofants.game.base;

import com.worldwarofants.game.base.console.command.AbstractCommandHandler;

public abstract class AbstractModule<Handler extends AbstractCommandHandler> {

    private Handler instance;

    public AbstractModule() {
        instance = setInstance();
    }

    public void executeCommandByName(String commandName) {
        instance.executeCommandByName(commandName);
    }

    protected abstract Handler setInstance();

}
