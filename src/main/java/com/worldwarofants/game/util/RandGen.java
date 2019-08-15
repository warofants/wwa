package com.worldwarofants.game.util;

import java.util.Random;

/*
    Utility class that provides an abstraction of Java's Random class.
    Its goal is to provide developers with a simple way to work with
    random number generation, as well as allow for precise tweaking
    of exact methods used.

    Please make sure to generate your random numbers within the project
    exclusively using this package.
*/

public class RandGen extends java.util.Random {
    private static final long serialVersionUID = -5378246343912387722L;

    Random generator;
    long seed;
    String seedString; // If a custom text input has been provided by user and hashed,

    // Overloaded seedless constructor
    public RandGen() {
        this.generator = new Random(); // Create a generator
        this.seed = generator.nextLong(); // Ask it to generate a seed for itself
        this.seedString = Long.toString(this.seed); // Save it to seedString as well
        this.generator.setSeed(seed); // And set its seed to what it gave
    }

    // Overloaded seeded (with a string) constructor
    public RandGen(String seedString) {
        if (seedString.matches("-?\\d+(\\.\\d+)?")) { // If the provided string is a valid long, use it as the seed
            this.seed = Long.parseLong(seedString);
            this.seedString = Long.toString(this.seed);
        } else { // But if not, hash and record it
            this.seed = seedString.hashCode();
            this.seedString = seedString;
        }
        this.generator = new Random(seed);
    }

    // Return seed used
    public long getSeed() {
        return this.seed;
    }

    // Return seedString used, if any
    public String getSeedString() {
        return this.seedString;
    }

    // Generate an int in range
    // If two ints are provided, use them to define a range
    // Range is START to END - 1.
    public int range(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start value cannot be greater than end value.");
        }
        int n = this.generator.nextInt(end - start);
        n += start;
        return n;
    }

    // If only one int is provided, assume range 0 to END - 1.
    public int range(int end) {
        int n = this.generator.nextInt(end);
        return n;
    }

    // Given an array, return a random element
    public Object choice(Object[] arr) {
        int i = range(arr.length);
        Object object = arr[i];
        return object;
    }

}