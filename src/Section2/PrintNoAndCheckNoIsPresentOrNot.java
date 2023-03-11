package Section2;
import java.util.Scanner;

public class PrintNoAndCheckNoIsPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size");
		int size= sc.nextInt();
		int a[]= new int[size];
		
		for(int i= 0; i<a.length; i++) {
			
			System.out.println("Add elements on "+ i + " index");
			a[i]=sc.nextInt();
			
		}System.out.println("Enter the No");
		
		int b =  sc.nextInt();
		
		Boolean flag= false;
		
		
		
		for(int i = 0; i<a.length; i++) {
			
			if(a[i]==b) {
				
			flag=true;
			}
			
			
		}
		if(flag==true) {
			System.out.println("No is present In array");
		}
		else {
			System.out.println("No is not present In array");
		}
	}
}
		

	


