package Section2;
import java.util.Scanner;


public class CabDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ola o = new Ola();
		boolean exit= true;
		
		while(exit) {
			
			System.out.println("Enter the Choice : \n1. Booked cab \n2. Cancel Cab \n3. Upadte Destination \n4. Update Pickup Point \n5. Display Details");
			System.out.println("-------------------------------------------");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: {
				System.out.println("Enter the Cab No");
				int cabNo= sc.nextInt();
				System.out.println("Enter the Car Name");
				String carName = sc.next();
				System.out.println("Enter the Driver Name");
				String driverName = sc.next();
				System.out.println("Enter the Destination");
				String destination = sc.next();
				System.out.println("Enter the Pickup Point");
				String pickup = sc.next();
				System.out.println("Enter the OTP");
				int otp = sc.nextInt();
				o.bookCab(new Cab(cabNo,carName,driverName,destination,pickup,otp));
				
			}
			break;
			case 2: {
				o.cancelCab();
			}
			break;
			case 3: {
				o.updateDestination();
			}
			break;
			case 4: {
				o.updatePickup();
			}
			break;
			case 5: {
				o.displayCab();
			}
			break;
			default:{
				System.out.println("Invalid Choice");
			}
			}
		}

	}

}
