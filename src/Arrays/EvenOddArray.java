package Arrays;

public class EvenOddArray {
 public static void main(String[] args) {
	
	 int arr[]= {4,9,25,6,2,7,5,9,0};
	 
	 for(int i=0;i<arr.length;i++) {
		 
		 if(arr[i]%2==0)
			 System.out.println("Even:"+ arr[i]);
		 else
			 System.out.println("Odd:"+ arr[i]);
	 }
	 System.out.println("------------");
	 evenoddarray();
		 
 }
 
 public static void evenoddarray() {
	 
	 int arr[] = {1,2,3,4,5,6,6,7,8,8,9,};
	 
	 for(int i=0;i<arr.length;i++) {
		 
		 if(arr[i]%2==0) {
			 System.out.println("Even :" +arr[i]);
		 }else {
			 System.out.println("odd :"+ arr[i]);
		 }
	 }
 }
}
