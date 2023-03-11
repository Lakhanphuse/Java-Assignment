package Section2;

import java.util.Scanner;

public class Mobile {

	Sim s;
	String brand;
	
	public Mobile(String brand) {
		this.brand=brand;
	}
	
	public void addSim(Sim s) {
		
		if(this.s==null) {
			
			this.s=s;
			System.out.println("Sim Added Successfully...");
		}
		else {
			System.err.println("Sim Already Added...");
		}
	}
	
	public void removeSim() {
		
		if(this.s==null) {
			
			System.out.println("Sim is not Added...");
		}
		else {
			
			this.s=null;
			System.out.println("Sim removed Successfully...");
		}
	}
	
	public void updateSim() {
		
		if(this.s==null) {
			System.out.println("Sim not Added Yet...");
		}
		else {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Simno");
			int simNo= sc.nextInt();
			s.setSimNo(simNo);
			System.out.println("Enter the New ServiceProvider");
			String serviceProvider= sc.next();
			s.setServiceProvider(serviceProvider);
			System.out.println("Sim update Successfully...");
			
			
		}
	}
	
	public void displayDetails() {
		
		if(this.s==null) {
			
			System.out.println("Sim is not Added yet...");
		}
		else {
			
			System.out.println("New SimNo : "+ s.getSimNo());
			System.out.println("New ServiceProvider : "+ s.getServiceProvider());
			System.out.println("Enter the Colour : "+ s.getColour());
		}
	}
	
}
