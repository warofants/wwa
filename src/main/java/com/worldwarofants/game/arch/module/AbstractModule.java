package com.worldwarofants.game.arch.module;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;
import com.worldwarofants.game.model.World;

/**
 * The Module is what is used to keep all of the different components connected.
 * Think of each Module like a container for a specific feature.
 * For example, MainMenuModule, CombatModule, ScoutingModule.
 *
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

    protected abstract CommandHandler initDependencies();

    public abstract ModuleName getModuleName();
}
