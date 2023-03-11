package Inheritance;

public class Child extends Parent{
         
	static int c;
	int d;
	
	public static void fromChild() {
		System.out.println("Hello from child");
	}
	public static void main(String[] args) {
		Parent p1= new Parent();
		System.out.println(p1.a);
		System.out.println(p1.b);
		p1.fromParents();
		
		
	/*	System.out.println(p1.c); //Compile time error Because 
		System.out.println(p1.d); //Parents referance p1 can't 
		p1.fromchild();   */      //access child's Property.
		
		Child c1= new Child ();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.fromParents();
		c1.fromChild();
		System.out.println(c1.c);
		System.out.println(c1.d);
		
	}                              
}
