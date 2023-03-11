package Section2;
import java.util.Scanner;
public class SchoolDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		School s1 = new School();
		
		boolean exit = true;
		
		while(exit) {
			
			System.out.println("Enter the choice \n1.Take Addmission \n2.Cancel Addmission \n3.Update Details \n4. Display Details");
			
			int choice = sc.nextInt();
			
		switch(choice) {
		
		case 1: {
			System.out.println("Enter the Name");
			String sname = sc.next();
			System.out.println("Enter the RollNo");
			String rollNo = sc.next();
			System.out.println("Enter the Contact No");
			long cno = sc.nextLong();
			System.out.println("Enter the Std");
			int std = sc.nextInt();
			s1.addStudent(new Student(sname, rollNo,cno,std));
			
					
		}
		break;
		case 2:{
			
			s1.cancelAddmission();
		}
		break;
		case 3:{
			s1.updateDetails();
		}
		break;
		case 4:{
			s1.displayDetails();
		}
		break;
		default :{
			
			System.out.println("Invalid Details....");
		}
		}	
		}

	}

}
