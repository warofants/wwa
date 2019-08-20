package com.worldwarofants.game.base;

import com.worldwarofants.game.model.World;

public abstract class AbstractController<View extends AbstractView> {

    protected World world;
    protected View view;

    public AbstractController(View view, World world) {
        this.world = world;
        this.view = view;
    }
}
