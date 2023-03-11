package Arrays;

public class EvenOddElementPosition {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,78,45,20};
		
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0)
				System.out.println("Even position:"+ arr[i]);
			else
				System.out.println("Odd Position:"+ arr[i]);
		}
	}
}
