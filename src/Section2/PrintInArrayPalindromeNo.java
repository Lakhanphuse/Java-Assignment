package Section2;

public class PrintInArrayPalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
		
		int a[] = {1221,3456,3223,2222,1269, 1111};
		
		for(int i = 0; i<a.length; i++) {
			
			int no = a[i];
			int rem = 0;
			int rev = 0;
			
			while(no!=0) {
				
				rem=no%10;
				rev=rev*10 + rem;
				no = no/10;
				
			}
			if(rev==a[i]) {
				System.out.println(a[i] + " ");
				count ++;
			}
		
		}
		System.out.println("Total : "+ count);

	}

}
