package Number;

public class PalidromeNumber9 {

	public static void main(String[] args) {
		
		int count =0;
		for(int i=1;i<=10000;i++)
		{
			int num=i;
			int rev=0;
			int rem=0;
			
			
			while(num!=0) {
				
				rem=num%10;
				rev=(rev*10)+rem;
				num=num/10;
			}
			if(i==rev) {
				System.out.println(i);
				count ++;
				
			}
		}
		
		System.out.println("Total Palindrome No is: "+  count)	;
		
	
	}
}
