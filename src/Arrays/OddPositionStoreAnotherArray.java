package Arrays;

public class OddPositionStoreAnotherArray {

	public static void main(String[] args) {
		
		int count=0;
		int arr[]= {4,9,25,6,2,7,5,0};
		int arr2[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2!=0) {
				
				arr2[count]=arr[i];
				count++;
			}
		}
		System.out.println("Second Array is:");
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
	}
}
