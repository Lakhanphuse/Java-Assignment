package Arrays;
import java.util.Scanner;

public class SimpleArray {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	int [] arr = new int [5];
	
	System.out.println("Enter the Array Element");
	
	for(int i=0;i<arr.length;i++)
		arr[i]= sc.nextInt();
	
	System.out.println("Array is");
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	
	
}
}
