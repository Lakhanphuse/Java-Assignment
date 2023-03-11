package Inheritance;

public class Bag {
	Ball b;
	
	public void addBall(int choice, double radius) {
		
		if(this.b==null) {
			
			if(choice==1) {
				
				b= new tennisBall(radius);     //UP Casting
			}
			else if(choice==2) 
			{
				b = new basketBall(radius);    // UP Casting
			}
			else {
				System.out.println("Invalid Choice");
			}
			
		}
		else {
			System.out.println("Ball Already Added");
		}
	}
	
	public void removeBall() {
		
		if(this.b==null) {
			System.out.println("Ball not yet Added...");
		}
		else {
			this.b=null;
			System.out.println("Ball removed Successfully...");
		}
	}
	
	public void checkBag() {
		
		if(this.b==null) {
			System.out.println("Bag is empty...");
		}
		else {
			System.out.println("Ball is added to Bag...");
		}
	}
	
	public void showGame() {
		
		if(this.b==null) {
			System.out.println("Ball not yet Added...");
		}
		else {
			
			if(b instanceof basketBall) {
				basketBall b1 = (basketBall)b;
				System.out.println("You can play :"+ b1.getName());
			}
			else {
				tennisBall t1 = (tennisBall )b;
				System.out.println("You can play :"+ t1.getName());
				
			}
		}
	}
	
	

}
