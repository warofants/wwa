package com.worldwarofants.game.base;

public abstract class AbstractController<View extends AbstractView> {

    protected View view;

    public AbstractController(View view) {
        this.view = view;
    }
}
