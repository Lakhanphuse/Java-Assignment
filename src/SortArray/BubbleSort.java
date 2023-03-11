package SortArray;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		int arr[]= {7,8,3,1,2};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i:arr)
			System.out.println(i);
		System.out.println("---------------");
		
		anotherMethod();
	}
	public static void anotherMethod() {
	

		int arr[]= {12,4,6,8,5,3,2,1};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				
				if(arr[j]>arr[i])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for(int i:arr)
			System.out.println(i);
	}
}
