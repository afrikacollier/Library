package com.tts;


import java.util.ArrayList;
import java.util.List;

public class Library{
	// Add the missing implementation to this class
	
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

	private List<Book> titles = new ArrayList<Book>();
	private String printAvailableBooks;
	private String printAddress;
	private String removeABook;
	
	//Create a new Library (checkmark)
    public Library(String printAddress) {
    	this.printAddress = printAddress;
	}
    
    
    // Return a book to the correct Library
	/*public returnBook(String returnBook) {
		// TODO Auto-generated method stub
		 * 
		 * addBook(list.remove
		Book returnBookPlease = (Book) returnBook;
		titles = new ArrayList<Book>();
		((Library) titles).addBook(returnBook);
		return returnBook;
	}*/
	
	//constructor for Library (checkmark)
	public Library() {
		
	}
	
	//constructor for Library (checkmark)
	public Library(String printAvailableBooks, String printAddress, List<Book> titles) {
		this.printAvailableBooks = printAvailableBooks;
		this.printAddress = printAddress;
		this.titles = titles;
	}
	
	
	// Print the titles of all available books from the correct Library (checkmark)
	public String printAvailableBooks() {
		// TODO Auto-generated method stub
		String totalBooks ="";
		if(titles != null) {
			for(int i = 0; i<titles.size(); i++) {
				Book b = titles.get(i);
				totalBooks = totalBooks +"\n"+ b.toString(); 
				printAvailableBooks = totalBooks;
			}
			System.out.println(printAvailableBooks);
			return printAvailableBooks;
		}else {
			System.out.println("There are no available books.");
			return printAvailableBooks; 
		}
	}


	/*public void borrowBook(String bookToBorrow) {
		for(int i = 0; i<titles.size();i++) {
			if(titles.get(i).equals(bookToBorrow)) {
				removeABook = titles.get(i);
			}else {
				System.out.println("Book is unavailable to borrow.");
			}
		}
	}*/
	
	//printAddress of the correct Library (checkmark)
	public void printAddress() {
		 System.out.println(this.printAddress);
	}
	
	// Print opening hours as 9am to 5pm (checkmark)
	public static void printOpeningHours() {
		System.out.println("Libaries are open daily from 9am to 5pm.");
	}
	
	//add books to a library catalog (checkmark)
	public List<Book> addBook(Book book) { 
			titles.add(book);
			return titles;
	}

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library (checkmark)
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses (checkmark)
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        /*firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();*/

        // Print the titles of all available books from both libraries (checkmark)
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        //firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
    
} 