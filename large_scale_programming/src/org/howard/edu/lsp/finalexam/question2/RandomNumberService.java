package org.howard.edu.lsp.finalexam.question2;

/**
 * A singleton service for random number generation functionality.
 * Uses our defined strategy pattern to choose the random number generation for a strategy.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    /**
     * Private constructor to prevent external instantiation.
     */
    private RandomNumberService() {
        // Default strategy if none set could be JavaRandomNumberStrategy
        this.strategy = new JavaRandomNumberStrategy();
    }

    /**
     * Retrieves the singleton instance of RandomNumberService.
     *
     * @return the single instance of RandomNumberService
     */
    public static synchronized RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the random number generation strategy at runtime.
     *
     * @param strategy the strategy to use for generating random numbers
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null.");
        }
        this.strategy = strategy;
    }

    /**
     * Generates a random positive integer using the currently set strategy.
     *
     * @return a positive integer
     */
    public int getRandomNumber() {
        return this.strategy.generateRandomNumber();
    }
}

