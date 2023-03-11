package Arrays;
import java.util.Scanner;


public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Size of Array");
		
		int size=sc.nextInt();
		System.out.println("-----------");
		
		int[] arr1 = new int[size];
		int n=arr1.length;
		
		for(int i=0;i<n;i++)
		{
			arr1[i]= new Scanner(System.in).nextInt();
		}
		
		System.out.println("Arr1[n-1] :"+ arr1[n-1]);
		System.out.println("_________________________________");
		
		
		
	}
	public static void Array2() {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Size of Array");
		
		int size=sc.nextInt();
		System.out.println("-----------");
		
		int[] arr2 = new int[size];
		int n=arr2.length;
		
		for(int a:arr2)
		{
			System.out.println(a);
		}
		
		//System.out.println("Arr1[n-1] :"+ arr2[n-1]);
		
	}
}
