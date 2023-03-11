package SortArray;
import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the elements in Array");
		int size=sc.nextInt();
		
		int arr[]= new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			
		          arr[i]= sc.nextInt();	         
		         
		}
		System.out.println("Enter the Array elements");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		 
		
		
	}
}
