package Collection;

import java.util.Scanner;
public class SchoolDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		School s1 = new School();
		
		boolean exit = true;
		
		while(exit) {
			
			System.out.println("Enter the choice \n1.Add Student \n2.Removed Student \n3.Display Student \n4.Update Details");
			
			int choice = sc.nextInt();
			
		switch(choice) {
		
		case 1: {
			System.out.println("Enter the Name");
			String sname = sc.next();
			System.out.println("Enter the Id");
			int id = sc.nextInt();
			System.out.println("Enter the Std");
			int std = sc.nextInt();
			s1.addStudent(new Student(sname,id,std));
			
					
		}
		break;
		case 2:{
			
			s1.removeStudent();
		}
		break;
		case 3:{
			s1.displayStudent();
		}
		break;
		case 4:{
			s1.updateDetails();
		}
		break;
		default :
			System.out.println("Invalid Details....");
		}	
		}

	}
}
