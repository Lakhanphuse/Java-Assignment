package Section2;

public class PrintElementFromEvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		 /*for(int i=1; i<a.length ; i=i+2) {
			
			System.out.println(a[i] + " ");
		} */
		
		// OR Method
		
		for(int i = 0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				System.out.println(a[i] + " ");
			}
		}

	}

}
