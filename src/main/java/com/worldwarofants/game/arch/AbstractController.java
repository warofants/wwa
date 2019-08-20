package com.worldwarofants.game.arch;

import com.worldwarofants.game.arch.module.ModuleNavigator;
import com.worldwarofants.game.arch.module.ModuleName;
import com.worldwarofants.game.model.World;

/**
 * TODO add docs
 * @param <View>
 * @author Veradux
 */
public abstract class AbstractController<View extends AbstractView> {

    private ModuleNavigator moduleNavigator;
    protected World world;
    protected View view;

    public AbstractController(View view, World world, ModuleNavigator navigator) {
        this.world = world;
        this.view = view;
        this.moduleNavigator = navigator;
    }

    protected void navigateTo(ModuleName moduleName) {
        moduleNavigator.navigateTo(moduleName);
    }
}
