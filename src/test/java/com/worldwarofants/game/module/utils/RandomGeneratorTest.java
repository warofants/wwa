package com.worldwarofants.game.module.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RandomGeneratorTest {

    @RepeatedTest(10)
    public void testRandomSeed() {
        RandomGenerator genWithRandomSeed = new RandomGenerator();
        String seed = genWithRandomSeed.getSeedString();

        int[] testInts = new int[10];
        for (int i = 0; i < testInts.length; i++) {
            testInts[i] = genWithRandomSeed.getIntInRange(256);
        }

        RandomGenerator genWithSameSeed = new RandomGenerator(seed);

        for (int i = 0; i < testInts.length; i++) {
            assertEquals(genWithSameSeed.getIntInRange(256), testInts[i]);
        }
    }

    @Nested
    class TestRandomRange {
        @Test
        public void testRandomRange_startGreaterThanEnd() {
            RandomGenerator gen = new RandomGenerator();
            
            assertEquals(0, gen.getIntInRange(100, 0));
        }

        @Test
        public void testRandomRange_startEqualsEnd() {
            RandomGenerator gen = new RandomGenerator();
            
            assertEquals(0, gen.getIntInRange(0, 0));
        }
    }

    @Nested
    class testStringSeedTests {

        @Test
        public void testStringSeed_alpha() {
            RandomGenerator gen = new RandomGenerator("testCase");
            assertEquals("testCase", gen.getSeedString());
        }

        @Test
        public void testStringSeed_numeric() {
            RandomGenerator gen = new RandomGenerator("09876543210");
            assertEquals("09876543210", gen.getSeedString());
        }

        @Test
        public void testStringSeed_alphanumeric() {
            RandomGenerator gen = new RandomGenerator("testCase09876543210");
            assertEquals("testCase09876543210", gen.getSeedString());
        }

        @Test
        public void testStringSeed_punctuationAndMathemathical() {
            RandomGenerator gen = new RandomGenerator("!@#$%^&*()\\\",.\\[]");
            assertEquals("!@#$%^&*()\\\",.\\[]", gen.getSeedString());
        }

        @Test
        public void testStringSeed_all() {
            RandomGenerator gen = new RandomGenerator("testCase0987654321!@#$%^&*()\\\"");
            assertEquals("testCase0987654321!@#$%^&*()\\\"", gen.getSeedString());
        }
    }

    @Nested
    class testLongSeedTests {

        @Test
        public void testLongSeed_zero() {
            RandomGenerator gen = new RandomGenerator("0");
            assertEquals(0, gen.getSeed());
            assertEquals("0", gen.getSeedString());
        }

        @Test
        public void testLongSeed_limitLower() {
            RandomGenerator gen = new RandomGenerator("-2147483648");
            assertEquals(-2147483648, gen.getSeed());
            assertEquals("-2147483648", gen.getSeedString());
        }

        @Test
        public void testLongSeed_limitUpper() {
            RandomGenerator gen = new RandomGenerator("2147483647");
            assertEquals(2147483647, gen.getSeed());
            assertEquals("2147483647", gen.getSeedString());
        }
    }
}