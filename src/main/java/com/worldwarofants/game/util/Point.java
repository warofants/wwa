package com.worldwarofants.game.util;

import java.lang.Math;

/**
* Utility class that aims to provide easy-to-use functionality for working with Points
* on a flat plane. The purpose of this is to allow developers to quickly and efficiencly
* work with arbitrary points, as well as do some simple geometric and trigonometric
* calculations.
* @author Plat251
* @version 1.0
* @since 2019-08-18
*/

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
    * Given two points, calculates the distance between them.
    * @param a First point.
    * @param b Second point.
    * @return Float with the distance between two points
    */
    public static double findDistanceBetweenTwoPoints(Point a, Point b) {
        // (X2 - X1)
        float dx = b.x - a.x;
        // (Y2 - Y1)
        float dy = b.y - a.y;
        // (X2 - X1)^2 + (Y2 - Y1)^2
        double sqrsum = Math.pow(dx, 2) + Math.pow(dy, 2);
        // Square root of everything
        double distance = Math.sqrt(sqrsum);
        return distance;
    }
}