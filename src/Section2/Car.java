package Section2;

public class Car {

	
		String colour;
		String company;
		double price;
		Engine e;
		public Car(String colour, String company, double price, Engine e) {    //Parameterize Constructor
			super();
			this.colour = colour;
			this.company = company;
			this.price = price;
			this.e = e;
		}
		public static void main(String[] args) {
			
			Car c1= new Car("Black","Tata", 2000, new Engine(13222,3456));     // Object
			
			System.out.println(c1.colour);
			System.out.println(c1.company);
			System.out.println(c1.price);
			System.out.println(c1.e.cc);
			System.out.println(c1.e.engineno);
		}
		
	}
	
	
		
		
		
	


