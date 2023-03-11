package SortArray;

public class QuickSort {

	public static void main(String[] args) {
		
		int arr[]= {9,8,3,1,2,7};
		int n=arr.length;
		
		sort(arr, 0, n-1);
		
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
	public static void sort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int pi=partition(arr,low,high);
			sort(arr,low,pi-1);
			sort(arr, pi+1,high);
		}
		
	}
	public static int partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;
		
				
				for(int j=low;j<high;j++)
				{
					if(arr[j]<pivot)
					{
						i++;
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
						
					}
				}
		i++;
		int temp =arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;
		
	}
}


// In this QuickSort array we can sort on the basis of low,high & pivot point 
//basis, means we fix the high point are comparing that high point with array[index]
// if we have 6 members in our array that we split in 3/3 part 
//[9,8,3,1,2,7] @9 is our low point & 7 is our high point & on basis of arrays Condition
//check array condition at compared it.
//if (9<7) then it will no enterd in loop,
// if (3<7) then it will enterd in loop again swap the members position with respect on for loop.
// & after swapping 3 members the loop is continues.
// & now we have low & high point is remaing for swapping,
// then the last statement is responsible for the last parameters.