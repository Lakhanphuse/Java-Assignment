package Section2;

public class PrintEvenElementFromArray {

	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6,8,10};
		
		int evencount=0;
		int oddcount=0;
		
		for(int i =0; i<a.length; i++) {
		
			if(a[i]%2==0) {
				
				System.out.println("Even :" + a[i] + " ");
				evencount ++;
			}
			else {
				System.out.println("Odd :" + a[i] + " ");
				oddcount ++;
			}
		}
		System.out.println("Total Evencount:  "+ evencount);
		System.out.println("Total Oddcount :  " + oddcount);
	}
}
