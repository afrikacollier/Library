package com.tts;


import java.util.ArrayList;
import java.util.List;

public class Library{
	// Add the missing implementation to this class

	private List<Book> titles = new ArrayList<Book>();
	private String printAvailableBooks;
	private String printAddress;
	private Book removeABook;
	
	//Create a new Library (checkmark)
    public Library(String printAddress) {
    	this.printAddress = printAddress;
	}
    
    
    // Return a book to the correct Library
	public void returnBook(String returnBook) {
	 	if(removeABook.toString().equals(returnBook)){
	 		titles.add(removeABook);
	 		System.out.println("You have successfully returned " +returnBook);
	 	}
	 	else {
	 		System.out.println("This book is not from our Library.");
	 }
	}
	
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
		if(titles.size() > 0) {
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


	public void borrowBook(String bookToBorrow) {
		if(titles.size() > 0 && titles.toString().contains(bookToBorrow)) {
			outer: 
			for(int i=0; i<titles.size(); i++){
					inner:
					if(titles.get(i).toString().equals(bookToBorrow)){
						removeABook = titles.remove(i);
						System.out.println("You have successfully borrowed " +bookToBorrow);
						continue outer;
					}else {
						break inner;
					}
			}
		}else {
			if(this.removeABook != null) {
				System.out.println("This book is currently not available.");
			}else {
			System.out.println("This book is not in our catalog.");
			}
		}
	}
	
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
        // Create two libraries (checkmark)
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
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries (checkmark)
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

        // Print the titles of available from the first library (checkmark)
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
    
} 