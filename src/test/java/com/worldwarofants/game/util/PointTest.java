package com.worldwarofants.game.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.worldwarofants.game.util.Point;

public class PointTest {
    Point testPointA = new Point(-10, 10);
    Point testPointB = new Point(10, 10);

    @Test
    public void TestDistance() {
        float distance = Point.findDistanceBetweenTwoPoints(testPointA, testPointB);
        assertEquals(20.0, distance);
    }
}