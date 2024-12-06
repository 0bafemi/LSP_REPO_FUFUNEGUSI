package org.howard.edu.lsp.finalexam.question2;

/**
 * A custom strategy implementation for generating random positive integers.
 * I used simple linear congruential generator (LCG)-style algorithm.
 */
public class CustomRandomNumberStrategy implements RandomNumberStrategy {
    // Parameters for a  LCG
    private long seed = System.currentTimeMillis();
    private static final long A = 1664525L;
    private static final long C = 1013904223L;
    private static final long M = (long) Math.pow(2, 32);

    /**
     * Generates a random positive integer using a simple custom LCG algorithm.
     *
     * @return a positive integer between 1 and Integer.MAX_VALUE
     */
    @Override
    public int generateRandomNumber() {
        seed = (A * seed + C) % M;
        // Convert the seed to a positive integer within a reasonable range
        int result = (int) (Math.abs(seed) % Integer.MAX_VALUE);
        return (result == 0) ? 1 : result; // ensure it's not zero
    }
}
