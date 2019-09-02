package com.worldwarofants.game.arch.console.command;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.AbstractModule;

/**
 * ICommand is used to describe what a console command does.
 * More specifically, which Controller method/methods it calls.
 * If the command has arguments, they will also be passed on to the controller.
 *
 * @see AbstractController
 * @author Veradux
 */
public interface ICommand<Controller extends AbstractController> {

    /**
     * <p>
     * Whenever the player inputs text into the console,
     * a command which matches the text is executed through this method. </p>
     * <p>
     * There is support for different modules to have the same commands.
     * There are some cases where that might be needed, depending on the design.
     * For example, a "back" command, which navigates to the previous screen. </p>
     * <p>
     * There is support for commands to have arguments.
     * For example, you could have a command called "move",
     * which needs directions or coordinates. The player then can input
     * "move left", or "move 4 2", 4 being X and 2 being Y.
     * The arguments are contained in an array of Strings.
     * When the player inputs their command, the text is split by spaces.
     * The first word is the command name, while the others are considered as arguments. </p>
     *
     * @param controller The controller of the module, to which this command belongs to.
     * @param arguments The arguments supplied by the player for this specific command.
     *
     * @see AbstractController
     * @see AbstractModule#executeCommand
     * @author Veradux
     */
    void execute(Controller controller, String[] arguments);
}
