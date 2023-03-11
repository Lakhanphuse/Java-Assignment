package Arrays;

public class AdditionOfArray {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9,10};
		int result[]=new int[arr1.length];
	
		
		for(int i=0;i<arr1.length;i++) {
			result[i]=arr1[i]+arr2[i];
			System.out.println(result[i]);
		}
		
		
		
	}
}
