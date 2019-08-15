package com.worldwarofants.game.logic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.worldwarofants.game.logic.Player;
import com.worldwarofants.game.logic.Queen;

public class PlayerTest {
    Player testPlayer = new Player(-10, 10);
    Queen queen;

    @Test
    public void testActiveToTrue() {
        testPlayer.setActive(true);
        assertEquals(true, testPlayer.isActive());

    }

    @Test
    public void testActiveToFalse() {
        testPlayer.setActive(false);
        assertEquals(false, testPlayer.isActive());

    }
}