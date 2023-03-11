package Other;

public class Apple extends Fruits_UP_Casting {
	
	int c ;
	int d;
	

	public static void main(String[] args) {
		
		Apple a1= new Apple();
		
		Fruits_UP_Casting f1 = a1;
		
		System.out.println(f1.a);
		System.out.println(f1.b);
		
	/*	System.out.println(f1.c);  //Compile Time Error 
		System.out.println(f1.d); */  //Because of we can only access
		                           //the members of superclass.
	}
}
