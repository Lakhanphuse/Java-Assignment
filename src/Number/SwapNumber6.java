package Number;

public class SwapNumber6 {

	public static void main(String[] args) {
		
		int a=3;
		int b=5;
		               // Only swap the values without third veriable
	/*	a=a+b;   //a=3+5=8
		
		b=a-b;  //b=8-5=3
		a=a-b;  // a=8-3=5
		
		System.out.println(a+" "+b);  */
		
		int temp=0;
		
		temp=a;
		a=b;      // swap the values with third veriables
		b=temp;
		 System.out.println(a+" "+b);
		
	}
}
