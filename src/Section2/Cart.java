package Section2;

import java.util.Scanner;

public class Cart {

	Book b;
	
	public void addInCart(Book b) {
		
		if(this.b==null) {
			this.b=b;
			System.out.println("Book is added Successfully.....");
		}
		else {
			System.out.println("Book is already Added");
		}
		
	}
	public void removeBook() {
		
		if(this.b==null) {
			
			System.out.println("Book is not Added");
		}
		else {
			this.b=null;
			System.out.println("Book is removed Successfully.....");
		}
		
	}
	public void updateBookDetails() {
		if(this.b==null) {
			System.out.println("Book is Not Added");
		}
		else {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the new Book Name");
		String bname= sc.next();
		b.setBname(bname);
		System.out.println("Enter the new Author Name");
		String author=sc.next();
		b.setAuthor(author);
		System.out.println("Enter the new Price");
		double price =sc.nextDouble();
		b.setPrice(price);
		System.out.println("New Details Updated Successfully.....");
		}
	}
	public void displayBookDetails() {
		
		if(this.b==null) {
			System.out.println("Book is not Added...");
		}
		else {
			
			System.out.println("Book Name : "+ b.getBname());
			System.out.println("Book Author : "+ b.getAuthor());
			System.out.println("Book Price : "+ b.getPrice());
		}
	}
}
