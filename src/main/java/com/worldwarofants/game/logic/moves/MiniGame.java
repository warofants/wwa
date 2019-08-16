package com.worldwarofants.game.logic.moves;

import com.worldwarofants.game.logic.intelligence.Human;
import com.worldwarofants.game.logic.world.WorldAPIRequest;

import java.util.ArrayList;

public interface MiniGame {
    ArrayList<WorldAPIRequest> run(Human human);
}
