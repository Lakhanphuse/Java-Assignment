package Arrays;

public class MargingOfArray {

	public static void main(String[] args) {
		
		int [] arr1= {1,2,3,4,5};
		int [] arr2= {6,7,8,9,10};
		
		int n1=arr1.length;
		int n2=arr1.length;
		
		int[]arr3 = new int[n1+n2];
		
		int count =0;
		
		for(int a:arr1)
		{
			arr3[count]=a;
			count++;
		}
		
		for(int a:arr2)
		{
			arr3[count]=a;
			count++;
		}
		
		for(int b:arr3)
		System.out.println(b); 
		//MargingOfTwoArray();
	}
	
	public static void MargingOfTwoArray() {
		
		int arr1[]= {1,2,3};
		int arr2[]= {4,5,6,};
		int n1=arr1.length;
		int n2=arr2.length;
		int arr3[]= new int[n1+n2];
		int count=0;
		
		
		for(int i=0;i<arr1.length;i++) {
			arr3[count]=i;
			count++;
			
		}
		
			
	}
}
