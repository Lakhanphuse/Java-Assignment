package Section2;

public class PrintDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {1,2,3,4,5,6,7,7,8,9,4,3,1,9}; // In output 1 is not showing ( But in array
		                                         //  If is is twice then why they not showing 1 in output
		for(int i = 0 ; i<a.length ; i++) {      // then I am puting 0 in 1st forloop means index Should start with 0;
			                                     // then I got output & in output 1 is showing.
			for(int j= i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println(a[j] + " ");
				}
			}
		}

	}

}
