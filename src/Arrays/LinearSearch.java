package Arrays;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int arr[]= {2,4,1,7,3,8,9};
		int idx = linearSearch(arr,7);
		
		if(idx>=0)
		{
			System.out.println("Index is :"+ idx);}
		else
		{
			System.out.println("Element is not found");
		}
		}
		
	
	
	public static int linearSearch(int arr[],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
         
	}return -1;
 }
}
