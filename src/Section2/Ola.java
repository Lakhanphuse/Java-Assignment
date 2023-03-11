package Section2;

import java.util.Scanner;

public class Ola {
	
	Cab b;
	
	public void bookCab(Cab b) {
		
		if(this.b==null) {
			this.b=b;
			System.out.println("Cab booked Successfully..."); 
		}
		else {
			System.out.println("Cab already Booked");
		}
	}
	
	public void cancelCab() {
		
		if(this.b==null) {
			throw new CabIsNotBookException();
		}
		else {
			this.b=null;
			System.out.println("Cab is cacel");
		}
	}
	
	public void updateDestination() {
		
		if(this.b==null) {
			System.out.println("Cab is not Booked...");
		}
		else {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the new Destination");
			String destination= sc.next();
			b.setDetination(destination);
			System.out.println("Destination updated Successfully...");
			
		}
	}
	
	public void updatePickup() {
		
		if(this.b==null) {
			System.out.println("Cab is not booked...");
		}
		else {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter new Pickup");
			String pickup = sc.next();
			b.setPickup(pickup);
			System.out.println("Pickup location Updated...");
		}
	}
	
	public void displayCab() {
		
		if(this.b==null) {
			System.out.println("Cab is not Added..");
		}
		else {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Otp");
			int otp = sc.nextInt();
			if(otp==b.getOtp()) {
				System.out.println("Cab No:"+ b.getCabNo());
				System.out.println("Car Name:"+ b.getCarName());
				System.out.println("Driver Name:"+ b.getDriverName());
				System.out.println("Destination :"+ b.getDetination());
				System.out.println("Pickup Point :"+ b.getPickup());
				
			}
			else {
				System.out.println("Wrong OTP...");
			}
		}
	}

}
