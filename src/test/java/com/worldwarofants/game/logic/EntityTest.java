package com.worldwarofants.game.logic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.worldwarofants.game.logic.Entity;

public class EntityTest {
    Entity testEntity = new Entity(-2147483647, 2147483647);

    @Test
    public void testX() {
        assertEquals(-2147483647, testEntity.getX());
    }

    @Test
    public void testY() {
        System.out.println(testEntity.getX());
        assertEquals(2147483647, testEntity.getY());
    }

    @Test
    public void testChangeX() {
        testEntity.setX(100);
        assertEquals(100, testEntity.getX());
    }

    @Test
    public void testChangeY() {
        testEntity.setY(99);
        assertEquals(99, testEntity.getY());
    }
}