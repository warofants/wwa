package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.base.IViewModel;

import java.util.ArrayList;
import java.util.List;

class ExampleViewModel implements IViewModel {

    private List<String> antNames;

    ExampleViewModel() {
        antNames = new ArrayList<>();
    }

    void setAntNames(List<String> antNames) {
        this.antNames = antNames;
    }

    List<String> getAntNames() {
        return antNames;
    }
}
