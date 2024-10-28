package com;


import java.util.ArrayList;
import java.util.Iterator;

public class Libaray {
	
	private int libId;
	private String Location;
	
	private Book b;
	
	private ArrayList <Book> book = new ArrayList<Book>();
	
	//addbook
	public void addBook(Book b) {
		book.add(b);
		System.out.println("Book Added Sucessfully..");
	}
//displaybooks
	
	public void displayBook() {
		if(book.isEmpty()) {
			System.out.println("Books Are Not Added Yet.");
			
			}
		else {
			for(Book b: book) {
				b.display();
				
			}
		}
		
		
	}
	//searching book
	public void searchBookBasedOnId(int id) {
		boolean isFound = false;
		if(book.isEmpty()) {
			System.out.println("Books are Not yet Added");
		}
		else {
			for(Book b: book) {
				if(b.getid() == id) {
					System.out.println("Book Found.."+b);
					isFound = true;
				}
			}
		}
		if(isFound == false) {
			//Dont show message throw exception
			throw new IndexOutBox();
		}
	}
	
	//update book
	
	public void updateBookCostbasedOnTittle(String tittle) {
		boolean isUpdated = false;
		if(book.isEmpty()) {
			System.out.println("Books are Not added Yet...");
		} else {
			for(Book b : book) {
				if(b.gettitle().equals(tittle)) {
					b.setcost(1000);
					System.out.println("Book cost updated...");
					isUpdated = true;
				}
			}
			if(isUpdated==false) {
				//Dont show message throw exception
				throw new Tittlemissmatch();
			}
		}
	}
	
	//remove the book
	
	public void removeBookbasedOnid(int id) {
		boolean isFound = false;
		if(book.isEmpty()) {
			System.out.println("Books are not yet added");
		}
		
		else {
			Iterator <Book> itr = book.iterator();
			while(itr.hasNext()) {
				Book b=itr.next();
				if(b.getid()==id) {
					itr.remove();
					System.out.println("book is removed successfully");
					isFound=true;
				}
			}
			if(isFound==false) {
				//Dont show message throw exception
				throw new IndexOutBox();
			}
		}
	}

	public void searchBasedOnAuthor(String s1) {
		boolean isFound=false;
		if(book.isEmpty()) {
			if(b.getauthor().equals(s1)) {
				System.out.println("BookTittle:"+b.gettitle());
				isFound=true;
			}
		}
		
	

	if(isFound=false) {
		//Dont show message throw exception
		throw new author();
	}
	
}
}

