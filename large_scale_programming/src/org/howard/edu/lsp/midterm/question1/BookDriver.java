package org.howard.edu.lsp.midterm.question1;

/**
 * The {@code BookDriver} class tests the functionality of the {@code Book} class.
 * It demonstrates object creation, equality checks, and string representation.
 */
public class BookDriver {
    /**
     * The main method executes the test cases for the {@code Book} class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create Book objects with specified details.
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);
        
        // Test the equals method.
        System.out.println(book1.equals(book2)); // Expected output: true
        System.out.println(book1.equals(book3)); // Expected output: false
        
        // Test the toString method.
        System.out.println(book1); // Expected output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
    }
}
