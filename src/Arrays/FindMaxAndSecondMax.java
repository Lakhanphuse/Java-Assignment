package Arrays;

public class FindMaxAndSecondMax {

	public static void main(String[] args) {
		
		int arr[] = {1,9,10,12,13,2,100,90,80,88};
		
		int max=arr[0];
		int secondmax= arr[max];
		//int thirdmax = arr[secondmax];
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondmax=max;
				
				max=arr[i];
			}
	    }
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>secondmax && arr[i]!=max)
			{
				secondmax=arr[i];
			}
		}
		
			
		
		System.out.println(max + " Is max Number of array");
		System.out.println(secondmax + " Is Second max Number of array");
		//System.out.println(thirdmax + " Is third max");
		
			FindMax_SeconMax();
		}
	
	
	public static void FindMax_SeconMax() {
		
		int arr[]= {1,2,3,6555,7,7788,8899};
		int max = arr[0];
		int secondmax = arr[max];
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=max && secondmax<arr[i]) {
				secondmax=arr[i];
			}
		}
		System.out.println("max :"+ max);
		System.out.println("second :"+ secondmax);
	}
		
		
	}

