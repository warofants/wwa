package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.base.AbstractModule;

public class ExampleModule extends AbstractModule<ExampleCommandHandler> {

    private static final String EXAMPLE_COMMAND_NAME = "example command";

    @Override
    protected ExampleCommandHandler setInstance() {
        ExampleViewModel viewModel = new ExampleViewModel();
        ExampleView view = new ExampleView(viewModel);
        ExampleController controller = new ExampleController(view);
        ExampleCommandHandler handler = new ExampleCommandHandler(controller);
        handler.addCommand(EXAMPLE_COMMAND_NAME, ExampleController::showView);
        return handler;
    }
}
