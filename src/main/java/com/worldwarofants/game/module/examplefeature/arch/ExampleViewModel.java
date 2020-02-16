package com.worldwarofants.game.module.examplefeature.arch;

import com.worldwarofants.game.arch.ViewModel;

import java.util.ArrayList;
import java.util.List;

class ExampleViewModel implements ViewModel {

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
