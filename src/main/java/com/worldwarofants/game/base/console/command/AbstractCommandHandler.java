package com.worldwarofants.game.base.console.command;

import com.worldwarofants.game.base.AbstractController;

import java.util.Arrays;
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

    private static final String NAME_AND_ARGS_DIVIDER = " ";
    private static final int COMMAND_NAME_POSITION = 0;
    private static final int COMMAND_ARGS_START_INDEX = 1;

    protected Controller controller;
    private Map<String, ICommand<Controller>> commands;

    public AbstractCommandHandler(Controller controller) {
        this.controller = controller;
        commands = new TreeMap<>(Comparator.naturalOrder());
        defineCommands(commands);
    }

    public void executeCommand(String input) {
        String[] dividedInput = input.split(NAME_AND_ARGS_DIVIDER);
        String commandName = dividedInput[COMMAND_NAME_POSITION];
        String[] arguments = Arrays.copyOfRange(dividedInput, COMMAND_ARGS_START_INDEX, dividedInput.length);

        if (commands.containsKey(commandName)) {
            commands.get(commandName).execute(controller, arguments);
        }
    }

    protected abstract void defineCommands(Map<String, ICommand<Controller>> commands);

}
