package Section2;

import java.util.Scanner;

public class MobileDriver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		Mobile m1 = new Mobile("Redmi");
		boolean exit = true;
		
		while(exit) {
			
			System.out.println("Enter the choice \n1. Add Sim in Mobile \n2. Remove sim from Mobile \n3. Update SimDetails in mobile \n4. Display Details in Mobile");
			System.out.println("-----------------------------------------------------------------------------");
			int choice= sc.nextInt();
			
			switch(choice) {
			
			case 1: {
				
				System.out.println("Enter the SimNo");
				int simNo = sc.nextInt();
				System.out.println("Enter the ServiceProvider");
				String serviceProvider= sc.next();
				System.out.println("Enter the Colour");
				String colour= sc.next();
				
				m1.addSim(new Sim(simNo,serviceProvider,colour) );
			}
			break;
			
			case 2: {
				
				m1.removeSim();
			}
			break;
			
			case 3: {
				m1.updateSim();
			}
			break;
			
			case 4: {
				m1.displayDetails();
			
				
			}
			break;
			
			default: {
				System.out.println("Invalid Choice");
			}
			}
		}
		

	}

}
