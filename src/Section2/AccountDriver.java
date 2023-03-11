package Section2;
import java.util.Scanner;

public class AccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Bank b =new Bank();
		boolean exit= true;
		
		while(exit) {
			System.out.println("Enter the choice \n1. Create Account \n2. Delete Account \n3. Display Account \n4. Update Account\n5. Deposit Money\n6. Withdraw Money\n7. Balance Enquiry");
			System.out.println("------------------------------");
			int choice = sc.nextInt();
			 switch(choice) {
			 
			 case 1: {
				 System.out.println("Enter the Account hoilder name");
				 String name = sc.next();
				 System.out.println("Enter the Contact No");
				 String cno = sc.next();
				 System.out.println("Enter the Account NO");
				 int acno = sc.nextInt();
				 System.out.println("Enter the Email address");
				 String email = sc.next();
				 System.out.println("Enter the city");
				 String city= sc.next();
				 System.out.println("Enter the Account balance");
				 int balance = sc.nextInt();
				 System.out.println("Enter the pin");
				 int pin = sc.nextInt();
				 b.creatAccount(new Account(name,cno,acno,email,city,balance,pin));
			 }
			 break;
			 case 2: {
				 b.deleteAccount();
			 }
			 break;
			 case 3: {
				 b.displayAccount();
			 }
			 break;
			 case 4: {
				 b.updateAccount();
			 }
			 break;
			 case 5: {
				 b.deposit();
			 }
			 break;
			 case 6: {
				 b.withdraw();
			 }
			 break;
			 case 7: {
				 b.balanceEnquiry();
			 }
			 break;
			 default: {
				 System.out.println("Invalid Choice");
			 }
			 }
		}
		

	}

}
