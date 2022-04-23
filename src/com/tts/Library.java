package com.tts;


import java.util.ArrayList;
import java.util.List;

public class Library{
	/*
	 * Library hours:
	 * Libraries are open daily from 9am to 5pm.
	 * Library addresses:
	 * 10 Main St.
	 * 228 Liberty St.
	 * Borrowing The Lord of the Rings:
	 * You successfully borrowed The Lord of the Rings
	 * Sorry, this book is already borrowed.
	 * Sorry, this book is not in our catalog. 
	 * Books available in the first library:
	 * The Da Vinci Code
	 * Le Petit Prince
	 * A Tale of Two Cities 
	 * Books available in the second library:
	 * No book in catalog 
	 * Returning The Lord of the Rings:
	 * You successfully returned The Lord of the Rings 
	 * Books available in the first library:
	 * The Da Vinci Code
	 * Le Petit Prince
	 * A Tale of Two Cities
	 * The Lord of the Rings
	 */

	private List<Book> titles;
	private String library;
	private String printAvailableBooks, printAddress;
	

	// Add the missing implementation to this class
	
	//Create a new Library
    public Library(String library) {
		// TODO Auto-generated constructor stub
    	this.library = library;
	}
    
    // Return a book to the correct Library
	public void returnBook(String string) {
		// TODO Auto-generated method stub
		
	}
	
	//constructor for Library
	public Library() {
	}
	
	//constructor for firstLibrary
	public Library(printAvailableBooks, printAddress) {
		this.printAvailableBooks = printAvailableBooks;
		this.printAddress = printAddress;
	}
	
	// Print the titles of all available books from the correct Library
	public String printAvailableBooks() {
		// TODO Auto-generated method stub
		return "Hello";
	}

	public void borrowBook(String bookToBorrow) {
	}
	
	//printAddress of the correct Library
	public void printAddress() {
		// TODO Auto-generated method stub
		 System.out.println(this.library);
	}
	
	// Print opening hours as 9am to 5pm (checkmark)
	public static void printOpeningHours() {
		System.out.println("Libaries are open daily from 9am to 5pm.");
	}
	
	//add books to a library catalog (checkmark)
	public List<Book> addBook(Book book) {
		this.titles = new ArrayList<Book>();
		titles.add(book);
		return titles;
	}

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
    
} 