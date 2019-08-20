package com.worldwarofants.game.arch.console.command;

import com.worldwarofants.game.arch.AbstractController;

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
    private static final String INVALID_COMMAND_MESSAGE = "Invalid, try again.";

    private Controller controller;
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
        else {
            // This line might not be final.
            // It depends on how the views are implemented to show their content,
            // because it might get in the way. If it does, it will be changed.
            System.out.println(INVALID_COMMAND_MESSAGE);
        }
    }

    /**
     * <p> There are two ways to add commands inside of this method,
     * depending on which you find more suitable.</p>
     * <p>
     *
     * 1. <code> commands.put(COMMAND_NAME, (ExampleController::method)); </code>
     * You can specify which method of the controller the command should execute like this.
     * This way is preferred if the command is a simple one, without many arguments. </p>
     *
     * <p>
     * 2. <code> commands.put(ReproduceCommand.COMMAND_NAME, new Command()); </code>
     * You can create the new Command as an object, and pass it like this.
     * This way is preferred if the command has a lot of arguments.
     * Because you can put the constants related to them
     * in their specific command class that they belong go. </p>
     *
     * @author Veradux
     */
    protected abstract void defineCommands(Map<String, ICommand<Controller>> commands);

}
