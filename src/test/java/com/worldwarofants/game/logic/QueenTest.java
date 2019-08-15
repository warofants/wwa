package com.worldwarofants.game.logic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.worldwarofants.game.logic.Queen;

public class QueenTest {
    Queen testQueen = new Queen(-2147483647, 2147483647);

    @Test
    public void testX() {
        assertEquals(-2147483647, testQueen.getX());
    }

    @Test
    public void testY() {
        System.out.println(testQueen.getX());
        assertEquals(2147483647, testQueen.getY());
    }

    @Test
    public void testChangeX() {
        testQueen.setX(100);
        assertEquals(100, testQueen.getX());
    }

    @Test
    public void testChangeY() {
        testQueen.setY(99);
        assertEquals(99, testQueen.getY());
    }
}