package Arrays;

public class SquareAndEvenPositionPrit {

	public static void main(String[] args) {
		
		int arr[]= {4,9,25,6,2,7,5,0};
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]*arr[i];
			if(i%2==0)
				System.out.println("Even Position:"+ arr[i]);
			
			
		}
	}
}
