package org.howard.edu.lsp.finalexam.question2;


/**
 * Client program that demonstrates the use of our RandomNumberService
 * and the Strategy pattern for random number generation.
 */
public class RandomNumberClient {

    public static void main(String[] args) {
        // Obtain the singleton service
        RandomNumberService service = RandomNumberService.getInstance();

        // Use the default strategy (JavaRandomNumberStrategy)
        System.out.println("Using JavaRandomNumberStrategy:");
        System.out.println("Random number: " + service.getRandomNumber());

        // Switch to the custom strategy at runtime
        service.setStrategy(new CustomRandomNumberStrategy());
        System.out.println("Using CustomRandomNumberStrategy:");
        System.out.println("Random number: " + service.getRandomNumber());
    }
}
