package com.worldwarofants.game.arch.console.command;

import com.worldwarofants.game.arch.AbstractController;

/**
 * TODO add docs
 * @param <Controller>
 */
public interface ICommand<Controller extends AbstractController> {

    void execute(Controller controller, String[] arguments);

}
