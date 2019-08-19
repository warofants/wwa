package com.worldwarofants.game.base.console.command;

import com.worldwarofants.game.base.AbstractController;

public interface ICommand<Controller extends AbstractController> {

    void execute(Controller controller);

}
