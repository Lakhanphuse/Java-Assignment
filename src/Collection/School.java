package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class School {

	Student s;
	
	ArrayList<Student>s1 = new ArrayList<Student>();
	
	public void addStudent(Student s)
	{
		this.s=s;
		s1.add(s);
		System.out.println("Addmission Successfull...");
		System.out.println("---------");
		
	}
	public void removeStudent()
	{
		if(this.s==null)
		{
			System.out.println("No Sstudent is add..");
		}
		else
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the id to Cancel the Addmission...");
			int id = sc.nextInt();
			
			for(Student so:s1)
			{
				if(id==so.id)
				{
					s1.remove(so);
					System.out.println("Addmission Cancel");
					return;
				}
			}
			System.out.println("Id does not exit");
		}
	}
	public void displayStudent()
	{
		if(this.s==null)
		{
			System.out.println("No student is added");
		}
		else
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the id to display of Student ");
			int id = sc.nextInt();
			for(Student so:s1)
			{
				if(id==so.id)
				{
					System.out.println("...Student Details...");
					System.out.println("Student name:" + so.sname);
					System.out.println("Student Id :"+ so.id);
					System.out.println("Std :"+ so.std);
					System.out.println("-------------");
					return;
				}
			}System.out.println("Id does not Exist");
			
		}
	}
	public void updateDetails()
	{
		if(this.s==null)
			System.out.println("No Student is Added");
		else
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id to update details of Student");
			int id = sc.nextInt();
			for(Student so:s1)
			{
				if(id==so.id)
				{
					System.out.println("Enter the new Std");
					int std = sc.nextInt();
					so.std=std;
					System.out.println("Std updated Successfully...");
					return;
				}
			}
			System.out.println("Id does not exit");
		}
	}
	
}
