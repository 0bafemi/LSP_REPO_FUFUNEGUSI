package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * A strategy implementation that uses Java's built-in Random class
 * to generate random positive integers.
 */
public class JavaRandomNumberStrategy implements RandomNumberStrategy {
    private Random random = new Random();

    /**
     * Generates a random positive integer using Java's built-in Random.
     * The number is bounded to ensure it is positive.
     *
     * @return a positive integer between 1 and Integer.MAX_VALUE
     */
    @Override
    public int generateRandomNumber() {
        // generate a random positive integer
        return random.nextInt(Integer.MAX_VALUE - 1) + 1;
    }
}
