package com.worldwarofants.game.base.console.command;

import com.worldwarofants.game.base.AbstractView;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * TODO write docs
 *
 * @param <View>
 * @author Veradux
 */
public abstract class AbstractCommandHandler<View extends AbstractView> {

    protected View view;
    private Map<String, ICommand<View>> commands;

    public AbstractCommandHandler(View view) {
        this.view = view;
        commands = new TreeMap<String, ICommand<View>>(Comparator.naturalOrder());
    }

    public void executeCommandByName(String commandName) {
        commands.get(commandName).execute(view);
    }

    public void addCommand(String commandName, ICommand<View> command) {
        commands.put(commandName, command);
    }
}
