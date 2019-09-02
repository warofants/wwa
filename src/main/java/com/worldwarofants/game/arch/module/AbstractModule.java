package com.worldwarofants.game.arch.module;

import com.worldwarofants.game.module.ModuleName;
import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;
import com.worldwarofants.game.model.World;

/**
 * <p>
 * The Module is what is used to keep all of the different components of a feature connected.
 * Think of each Module like a container for a specific feature.
 * For example, MainMenuModule, CombatModule, ScoutingModule. </p>
 * <p>
 * For the more advanced readers:
 * This class is necessary because it allows inversion of control for the components.
 * Without it, an external dependency injection framework would have been needed instead.
 * </p>
 *
 * @author Veradux
 */
public abstract class AbstractModule<CommandHandler extends AbstractCommandHandler> {

    private CommandHandler commandHandler;
    protected World world;
    protected IModuleNavigator navigator;

    public AbstractModule(World world, IModuleNavigator navigator) {
        this.world = world;
        this.navigator = navigator;
        commandHandler = initDependencies();
    }

    /**
     * This is the main reason for modules to exist.
     * This is where you create all of the components in the architecture.
     * In it, you have to create a ViewModel, View, Controller, and a CommandHandler.
     * Then you just return that command handler.
     */
    protected abstract CommandHandler initDependencies();

    /**
     * This method runs whenever you navigate to a module.
     * It executes the starting command defined in the command handler of that module.
     *
     * @param arguments the arguments passed in from the navigateTo method.
     * Those arguments can be the ones from the player's previous input,
     * or altered by the controller for some specific case.
     *
     * @see IModuleNavigator#navigateTo(ModuleName, String[])
     */
    public void start(String[] arguments) {
        commandHandler.executeStartingCommand(arguments);
    }

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
     * @see ICommand#execute
     * @author Veradux
     */
    public void executeCommand(String input) {
        commandHandler.executeCommand(input);
    }

    public abstract ModuleName getModuleName();
}
