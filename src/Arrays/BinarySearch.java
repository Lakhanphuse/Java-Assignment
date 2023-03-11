package Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,};
		System.out.println("Enter the Number");
		int x= new Scanner(System.in).nextInt();
		int idx = binarySearch(arr, x,0, arr.length-1);
		
		if(idx>=0)
		{
			System.out.println("Index is:" +idx);
		}
		else
		{
			System.out.println("Not Found!!!!!!");
		}
		
		
		
	}
	public static int binarySearch(int arr[],int x,int low,int high)
	{
		if (low<high)
		{
			int mid = low+(high-low)/2;
			for(int i=0;i<arr.length;i++)
			{
				if(x==arr[mid])
				{
					return mid;
				}
				else if(x<arr[mid])
				{
					return binarySearch(arr,x,low,mid-1);
				}
				else
				{
					return binarySearch(arr, x, mid+1, high);
				}
			}
		}
		return -1;
	}
}
