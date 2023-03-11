package Section2;

import java.util.Scanner;

public class Facebook {
	
	User u;
	
	public void login(User u) {
		
		if(this.u==null) {
			this.u=u;
			System.out.println("Login Successfully...");
		}
		else {
			
			System.out.println("Already Login");
		}
	}
	
	public void logout() {
		
		if(this.u==null) {
			
			System.out.println("Not logged in get...");
		}
		else {
			this.u=null;
			System.out.println("Logout Sucessfully...");
			
		}
	}
	
	public void updateStatus(){
		
		if(this.u==null) {
			System.out.println("Not logged in yet...");
		}
		else {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Password");
			int pswd= sc.nextInt();
			
			if(pswd==u.getPswd()) {
				
				System.out.println("Enter the new Status");
				String status = sc.next();
				System.out.println("Status update Successfully...");
			}
			else {
				System.out.println("Wrong Password...");
			}
		}
	}
	
	public void display() {
		
		if(this.u==null) {
			System.out.println("Not logedin yet...");
		}
		else {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Password");
			int pswd= sc.nextInt();
			
			if(pswd==u.getPswd()) {
				System.out.println("userName : "+ u.getUname());
				System.out.println("Contact No : " + u.getCno());
				System.out.println("Status : "+ u.getStatus());
			}
			else {
				System.out.println("Wrong Password.");
			}
		}
	}
	
	public void changePswd() {
		
		if(this.u==null) {
			System.out.println("Not loggedin yet...");
		}
		else {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Old Password");
			int pswd = sc.nextInt();
			
			if(pswd==u.getPswd()) {
				System.out.println("Enter the new Password");
				int npswd=sc.nextInt();
				u.setPswd(npswd);
				System.out.println("Pass Changed Successfully...");
			
			}
			else {
				System.out.println("Wrong Password.");
			}
		}
	}
	

}
