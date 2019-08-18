package com.worldwarofants.game.base.console.command;

import com.worldwarofants.game.base.AbstractView;

public interface ICommand<View extends AbstractView> {

    public void execute(View view);

}
