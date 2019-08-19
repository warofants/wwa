package com.worldwarofants.game.base.console.command;

import com.worldwarofants.game.base.AbstractController;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * TODO write docs
 *
 * @param <Controller>
 * @author Veradux
 */
public abstract class AbstractCommandHandler<Controller extends AbstractController> {

    protected Controller controller;
    private Map<String, ICommand<Controller>> commands;

    public AbstractCommandHandler(Controller controller) {
        this.controller = controller;
        commands = new TreeMap<>(Comparator.naturalOrder());
    }

    public void executeCommandByName(String commandName) {
        commands.get(commandName).execute(controller);
    }

    public void addCommand(String commandName, ICommand<Controller> command) {
        commands.put(commandName, command);
    }
}
