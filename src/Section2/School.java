package Section2;

import java.util.Scanner;

public class School {
	Student s;
	
	public void addStudent(Student s) {
		
		if(this.s==null) {
			
			this.s=s;
			System.out.println("Addmission Successful.....");
		}
		else {
			System.out.println("Student is already added...");
		}
	}
	public void cancelAddmission() {
		
		if(this.s==null) {
			
			System.out.println("Student is not added yet.....");
		}
		else {
			this.s=null;
			System.out.println("Addmission Cancelled...");
			
		}
	}
	public void updateDetails() {
		
		if(this.s==null) {
			
			System.out.println("Student is not added yet.....");
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the new contact No");
			long cno = sc.nextLong();
			s.setCno(cno);
			System.out.println("Enter the new Std");
			int std = sc.nextInt();
			s.setStd(std);
			System.out.println("Details updated Successfully.....");
		}
	}
	public void displayDetails() {
		
		if(this.s==null) {
			System.out.println("Student is not Added yet.....");
			
		}
		else {
			
			System.out.println("Student Name : " + s.getSname());
			System.out.println("Student RollNo : " + s.getRollNo());
			System.out.println("Student Contact No : " + s.getCno());
			System.out.println("Student Std : " + s.getStd());
		}
	}

}
