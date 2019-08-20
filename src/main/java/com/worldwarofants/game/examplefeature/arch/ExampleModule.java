package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.ModuleNavigator;
import com.worldwarofants.game.model.World;

public class ExampleModule extends AbstractModule<ExampleCommandHandler> {

    private static final String MODULE_NAME = "Example";

    public ExampleModule(World world, ModuleNavigator navigator) {
        super(world, navigator);
    }

    @Override
    protected ExampleCommandHandler initDependencies() {
        ExampleViewModel viewModel = new ExampleViewModel();
        ExampleView view = new ExampleView(viewModel);
        ExampleController controller = new ExampleController(view, world, navigator);
        return new ExampleCommandHandler(controller);
    }

    @Override
    public String getModuleName() {
        return MODULE_NAME;
    }
}
