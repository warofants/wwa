package com.worldwarofants.game.arch;

import com.worldwarofants.game.model.World;

/**
 * TODO add docs
 * @param <View>
 * @author Veradux
 */
public abstract class AbstractController<View extends AbstractView> {

    protected World world;
    protected View view;

    public AbstractController(View view, World world) {
        this.world = world;
        this.view = view;
    }
}
