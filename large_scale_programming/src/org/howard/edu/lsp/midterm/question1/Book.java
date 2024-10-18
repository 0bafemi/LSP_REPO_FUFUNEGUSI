package org.howard.edu.lsp.midterm.question1;

/**
 * The {@code Book} class represents a book with a title, author, ISBN, and the year it was published.
 */
public class Book {
	
    // Private fields for proper encapsulation.
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;
    
    /**
     * Constructs a new {@code Book} with the specified title, author, ISBN, and year published.
     *
     * @param title          the title of the book
     * @param author         the author of the book
     * @param ISBN           the ISBN number of the book
     * @param yearPublished  the year the book was published
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }
    
    // Getters and setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    
    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }
    
    public int getYearPublished() { return yearPublished; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }
    
    /**
     * Compares this book to the specified object for equality.
     * Two books are considered equal if they have the same ISBN and author.
     *
     * @param obj  the object to compare with
     * @return {@code true} if this book is equal to the specified object; {@code false} otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }
    
    /**
     * Returns a string representation of this book.
     *
     * @return a string containing the title, author, ISBN, and year published
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}
