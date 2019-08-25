package com.worldwarofants.game.module.examplefeature.arch;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.module.ModuleName;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.service.AntsService;

public class ExampleModule extends AbstractModule<ExampleCommandHandler> {

    public ExampleModule(World world, IModuleNavigator navigator) {
        super(world, navigator);
    }

    @Override
    protected ExampleCommandHandler initDependencies() {
        ExampleViewModel viewModel = new ExampleViewModel();
        ExampleView view = new ExampleView(viewModel);
        AntsService service = new AntsService(world);
        ExampleController controller = new ExampleController(view, navigator, service);
        return new ExampleCommandHandler(controller);
    }

    @Override
    public ModuleName getModuleName() {
        return ModuleName.EXAMPLE;
    }
}
