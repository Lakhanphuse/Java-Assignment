package Section2;
import java.util.Scanner;

public class ReverseTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
	
		int []  a = new int [size];
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Add elements on " + i + " index");
			a[i] = sc.nextInt();
			
		}
		System.out.println("Array before Reverse");
		
		for(int i=0; i<a.length ; i++) {
			
			System.out.println(a[i] + " ");
		}
		System.out.println("Array After Reverse");
		
		for(int i= a.length -1 ; i>=0; i--) {
			System.out.println(a[i] + " ");
		}
		
		
		
		

	}

}
