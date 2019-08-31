package com.worldwarofants.game.module.utils;

import java.util.Random;

/**
 * Utility class that provides an abstraction of Java's Random class. Its goal
 * is to provide developers with a simple way to work with random number
 * generation, as well as allow for precise tweaking of exact methods used.
 * Please make sure to generate your random numbers within the project
 * exclusively using this class.
 * 
 * @author Plat251
 * @since 2019-08-15
 */

public class RandomGenerator extends Random {

    private static final long serialVersionUID = -5378246343912387722L;
    private static final String VALID_LONG_REGEX = "(-|\\+)?\\d+" ;

    private long seed;
    private String seedString;

    public RandomGenerator() {
        super();
        this.seed = nextLong();
        this.seedString = Long.toString(this.seed);
        setSeed(seed);
    }

    public RandomGenerator(String seedString) {
        if (seedString.matches(VALID_LONG_REGEX)) {
            this.seed = Long.parseLong(seedString);
            this.seedString = seedString;
        } else {
            this.seed = seedString.hashCode();
            this.seedString = seedString;
        }
        setSeed(seed);
    }

    /**
     * @return long Returns the numeric seed used.
     */
    public long getSeed() {
        return this.seed;
    }

    /**
     * @return String Returns the string seed used. May be same as non-string seed.
     */
    public String getSeedString() {
        return this.seedString;
    }

    /**
     * Generate an int in range defined by two ints, start and end. Start must not be
     * greater or equal to end, and end minus start must not result in a value greater than
     * max value of int, otherwise end will be returned.
     * 
     * @return int Returns a random integer between start and end.
     */
    public int getIntInRange(int start, int end) {
        if (start >= end) {
            return end;
        }
        int randomNumber = this.nextInt(end - start);
        randomNumber += start;
        return randomNumber;
    }

    /**
     * @return int an int in range from 0 to end.
     */
    public int getIntInRange(int end) {
        return getIntInRange(0, end);
    }
}
