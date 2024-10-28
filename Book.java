package com;

public class Book {
	
	private String tittle; // java ||sql||python
	private int id;//even
	private int cost;//300-2000
	private int noOfPages;//500 -3000
	private String author;//James||scott||alien
	
	public Book() {}
	
	public Book(String tittle,int id,int cost,int noOfPages,String author) {
		if(validateTittle(tittle)) {
			this.tittle=tittle;
		}
		if(validateid(id)) {
			this.id=id;
		}
		
		if(vaildatecost(cost)) {
			this.cost=cost;
		}
		if(validatepages(noOfPages)) {
			this.noOfPages=noOfPages;
		}
		this.tittle=tittle;
		this.id=id;
		this.cost=cost;
		this.noOfPages=noOfPages;
		this.author=author;
	}
	
	public void settitle(String tittle) {
		   this.tittle=tittle;

		 }
		  public String gettitle() {
		   return tittle;
		  }
		  public void setauthor(String author) {
		   this.author=author;
		  }
		  public String getauthor() {
		   return author;
		  }
		  public int getid() {
		   return id;
		  }
		  public void setnoOfPages(int noOfPages) {
		   this.noOfPages=noOfPages;
		  }
		  public int getnoOfPages() {
		   return noOfPages;
		  }
		  public void setcost(int cost) {
		   this.cost=cost;
		  }
		  public int getcost() {
		   return cost;
		  }
		  public boolean validateTittle(String tittle) {
			  if(tittle=="Java"||tittle=="Sql"||tittle=="Pyhton") {
				  return true;
				  
			  }
			  else {
				  return false;
			  }
			  
		  }
		  public boolean validateid(int id) {
			  if(id%2==0) {
				  return true;
			  }
			  else {
				  return false;
			  }
		  }
		  
		  public boolean vaildatecost(int cost) {
			  if(cost>=2000) {
				  return true;
			  }
			  else {
				  return false;
			  }
		  }
		  public boolean validatepages(int pages) {
			  if(pages>=3000) {
				  return true;
			  }
			  else {
				  return false;
			  }
		  }
		  public boolean validateauthor(String author) {
			  if(author=="James"||author=="Scott"||author=="Alean") {
				  return true;
			  }
			  else {
				  return false;
			  }
		  }
		  public void display() {
		   System.out.println("BookTitle:"+gettitle());
		   System.out.println("Bookid:"+getid());
		   System.out.println("Bookcost:"+getcost());
		   System.out.println("BooknoOfPages:"+getnoOfPages());
		   System.out.println("Bookauthor:"+getauthor());
		   
		  }
		  @Override
		  public String toString() {
		   
		    return " \n tittle "+tittle+ "\nid"+id+ "\n author" +author+ "\n noOfPages------->" +noOfPages + "\n cost" +cost +"\n id="+id+"\n-------------------------->";
		   }

}
