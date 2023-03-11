package Section2;

import java.util.Scanner;

public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Cart c1 = new Cart();
		
		boolean exit = true;
		
		while(exit) {
			System.out.println("Enter the choices \n1. Add The Books \n2. Removed the Books \n3. Update the Books \n4. Display the Books");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: {
				System.out.println("Enter the Book name");
				String bname= sc.next();
				System.out.println("Enter the Author name");
				String auhtor = sc.next();
				System.out.println("Enter the Price");
				double price = sc.nextDouble();
				c1.addInCart(new Book(bname,auhtor,price));
			}
			break;
			case 2: {
				 c1.removeBook();
			}
			break;
			case 3: {
				c1.updateBookDetails();
			}
			break;
			case 4: {
				c1.displayBookDetails();
			}
			break;
			default: {
				System.out.println("Invalid Choices");
			}
		}
			
		}
		

	}

}
