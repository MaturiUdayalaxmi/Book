package com;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[]args) {
		String tittle;
		int id;
		int pages;
		int cost;
		String author;
		
		Libaray l = new Libaray();
		Scanner s = new Scanner(System.in);
		boolean isStart=true;
		while(isStart) {
			  System.out.println("Enter the choice:\n 1.To Add the book\n 2.Display book details\n 3.Search book based on id\n 4.Search book based on Author\n 5.Update cost of the book based on title \n 6.Remove book details by Id \n 7.Exit");
			  
			  int ch=s.nextInt();
			   switch(ch) {
			   case 1:
			   {
				   while(true) {
					   try {
						 
			    System.out.println("Enter the title of book");
			    tittle=s.next();
			    System.out.println("Enter the id of book");
			    id=s.nextInt();
			    System.out.println("Enter the pages of book");
			    pages=s.nextInt();
			    System.out.println("Enter the cost of book");
			   cost=s.nextInt();
			    System.out.println("Enter the author of the book");
			    author =s.next();
			   
			    l.addBook(new Book(tittle,id,pages,cost,author));
			    break;
			   }
					   catch(Tittlemissmatch t) {
						   System.out.println("enter the vaild");
					   }
					   
				   }
			   }
			  
			   case 2:
			   {
			    l.displayBook();
			    
			    
			   }
			   break;
			   case 3:
			   {
				   try {
					   
				  
			    System.out.println("enter the id");
			    int i=s.nextInt();
			    l.searchBookBasedOnId(i);
			  
			   break;
			   }
			   catch(IndexOutBox i) {
				   System.out.println("enter the valid id");
			   }
			   }
			   case 4:
			   {
				   try {
			    System.out.println("Enter the author name");
			    String s1 = s.next();
			    l.searchBasedOnAuthor(s1);
			   
			    break;
			   }
			    catch(author a) {
			    	System.out.println("enter valid author name");
			    }
			   }
			   case 5:
			   {
				   try {
			    System.out.println("Enter the title of the book");
			    String s1=s.next();
			    l.updateBookCostbasedOnTittle(s1);
			   
			   break;
				   }
			   catch(Costrange c) {
				   System.out.println("enter the valid book tittle,, update the cost");
			   }
			   }
			   
			   case 6:
			   {
				   try {

			    System.out.println("Enter the id");
			    int i=s.nextInt();
			    l.removeBookbasedOnid(i);
			  
			   break;
			   }
				   catch(IndexOutBox i) {
					   System.out.println("enter the valid id ,, remove book based on id");
				   }
			   }
			   case 7:
			   {
			    isStart=false;
			    System.out.println("Thank you...!");
			   }
			   break;
			   default:
			    System.out.println("Entered invalid choice");
			    
			   }
		}
		
	}

}
