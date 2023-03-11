package Section2;
import java.util.Scanner;

public class FacebookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		Facebook f1= new Facebook();
		boolean exit = true;
		
		while(exit) {
			
			System.out.println("Enter the choice \n1. Login \n2. Logout \n3. Update the Status \n4. Display the Details \n5. Change the Password");
			System.out.println("-----------------------------------------------------------------");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1: {
				System.out.println("Enter the UserName");
				String uname= sc.next();
				System.out.println("Enter the Contact Nnumber");
				int cno= sc.nextInt();
				System.out.println("Enter the Status");
				String status= sc.next();
				System.out.println("Enter the Password");
				int pswd= sc.nextInt();
				f1.login(new User(uname,cno,status,pswd));
			}
			break;
			case 2: {
				f1.logout();
			}
			break;
			case 3: {
				f1.updateStatus();
			}
			break;
			case 4: {
				f1.display();
			}
			break;
			case 5: {
				f1.changePswd();
			}
			break;
			default :{
				System.out.println("Invalid Choice1");
			}
			}
		}
		

	}

}
