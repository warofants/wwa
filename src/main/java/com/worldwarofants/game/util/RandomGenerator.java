package com.worldwarofants.game.util;

import java.util.Random;

/**
 * Utility class that provides an abstraction of Java's Random class. Its goal
 * is to provide developers with a simple way to work with random number
 * generation, as well as allow for precise tweaking of exact methods used.
 * Please make sure to generate your random numbers within the project
 * exclusively using this package.
 * 
 * @author Plat251
 * @since 2019-08-15
 */

public class RandomGenerator extends java.util.Random {
    private static final long serialVersionUID = -5378246343912387722L;
    private static final String VALID_LONG_REGEX = "-?\\d+(\\.\\d+)?";

    private Random generator;
    private long seed;
    private String seedString;

    public RandomGenerator() {
        this.generator = new Random(); // Create a generator
        this.seed = generator.nextLong(); // Ask it to generate a seed for itself
        this.seedString = Long.toString(this.seed); // Save it to seedString as well
        this.generator.setSeed(seed); // And set its seed to what it produced

    }

    public RandomGenerator(String seedString) {
        if (seedString.matches(VALID_LONG_REGEX)) {
            this.seed = Long.parseLong(seedString);
            this.seedString = Long.toString(this.seed);
        } else {
            this.seed = seedString.hashCode();
            this.seedString = seedString;
        }
        this.generator = new Random(seed);
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
     * Generate an int in range If two ints are provided, use them to define a range
     * If only one int is provided, range starts at 0. Range is START to END - 1.
     * 
     * @return int Returns a random integer.
     */
    public int range(int start, int end) {
        try {
            if (start > end) {
                throw new RangeStartGreaterThanRangeEndException("Range start int is greater than range end int!");
            }
            int randomNumber = this.generator.nextInt(end - start);
            randomNumber += start;
            return randomNumber;
        } catch (RangeStartGreaterThanRangeEndException err) {
            err.printStackTrace();
            return 0;
        }
    }

    class RangeStartGreaterThanRangeEndException extends Exception {
        private static final long serialVersionUID = -1806262497608288018L;

        RangeStartGreaterThanRangeEndException(String message) {
            super(message);
        }
    }

    /**
     * Generate an int in range If two ints are provided, use them to define a range
     * If only one int is provided, range starts at 0. Range is START to END - 1.
     * 
     * @return int Returns a random integer.
     */
    public int range(int end) {
        int randomNumber = this.generator.nextInt(end);
        return randomNumber;
    }
}