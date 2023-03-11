package Arrays;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Size of Array");
		
		int size=sc.nextInt();
		System.out.println("-----------");
		
		int[] arr1 = new int[size];
		int n=arr1.length;
		int sum=0;
	
		System.out.println("Enter the Array element");
		
		for(int i=0;i<n;i++)
		{
			arr1[i]= sc.nextInt();
		}
		
		for(int a:arr1)
			sum=sum+a;
		
	    int avg= sum/n;
	
		
		System.out.println("Sum of all element :"+ sum);
		System.out.println("Avg of all element :"+ avg);
		
		//sumOfArray1();
	}
	
	public static void sumOfArray1() {
		
		
		int arr[]= {20,3,45,6,7,8};
		
		int sum=0;
	
	
	 for(int i=0;i<arr.length;i++)
		  sum= sum+arr[i];
	 
	 System.out.println("Sum:" + sum);
	
	 
	}
}
