package Inheritance;

public class Car extends Vehicle {
	String colour;
	double price;
	
	public Car(String type,String colour,double price)
	{
		super(type);
		this.colour=colour;
		this.price=price;
	}
	public void printDetails() {
		System.out.println("Type:"+ type);
		System.out.println("Car colour:"+colour);
		System.out.println("Price:"+ price);
		
	}
	public static void main(String[]args) {
		Car c1=new Car("3 Wheeler","Black",30000);
		
		c1.printDetails();
	}

}
