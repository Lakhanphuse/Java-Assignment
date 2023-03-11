package Inheritance;

import java.util.Scanner;


public class BagDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Bag b1= new Bag();
		
		boolean exit = true;
		
		while(exit) {
			
			System.out.println("Enter the Choice \n1. Add Ball \n2.Removed Ball \n3.Check Bag \n4.Show Game");
			System.out.println("-----------------------------------");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:{
				System.out.println("1.Tennis Ball \n2. Basket Ball");
				choice = sc.nextInt();
				
				switch (choice) {
				case 1:{
					System.out.println("Enter the Tennis Ball Radius");
					double radius = sc.nextDouble();
					b1.addBall(choice, radius);
					System.out.println("Tennis Ball Added Successfully...");
				}
				break;
				case 2:{
					System.out.println("Enter the Basket Ball Radius");
					double radius = sc.nextDouble();
					b1.addBall(choice, radius);
					System.out.println("Basket Ball Added Successfully...");
				}
				break;
				default:{
					System.out.println("Invalid Choice");
				}
				break;
				}
			}
			break;
			case 2:{
				b1.removeBall();
			}
			break;
			case 3:{
				b1.checkBag();
			}
			break;
			case 4:{
				b1.showGame();
			}
			break;

			default:{
				System.out.println("Invalid Choice");
			}
				break;
			}
		}
	}

}
