package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.module.ModuleName;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;

public class ExampleModule extends AbstractModule<ExampleCommandHandler> {

    public ExampleModule(World world, IModuleNavigator navigator) {
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
    public ModuleName getModuleName() {
        return ModuleName.EXAMPLE;
    }
}
