package Number;

public class NumberProgram3 {  // Fibonacci Series 
	static int n1=0;
	 static int  n2=1;
	 static int a=0;
	 
	public static void main(String[] args) {
		
		
		
	/*	for(int i=1;i<=10;i++) {
			
			System.out.println(n1+" ");
			int a=n1+n2;
			
			n1=n2;
			n2=a;   
		}*/
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(fibonacci(10));
		
		
	}
	
	public static int fibonacci(int count) {
		
		if(count>0) {
		System.out.println(n1+" ");
		a=n1+n2;
		n1=n2;
		n2=a;
		
		fibonacci(count-1);
		return n1;
		
		}
		return 1;
	}

}
