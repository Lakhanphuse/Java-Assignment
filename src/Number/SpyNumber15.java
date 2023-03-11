package Number;

public class SpyNumber15 {

	public static void main(String[] args) {
		
		int a=123;
		int rem=0;
		int sum=0;
		int mul=1;
		int temp=a;
		
		while(temp!=0)
		{
			 rem=temp%10;
			sum=sum+(rem);
			mul=mul*rem;
			temp/=10;
		}
		
		if(sum==mul) {
			System.out.println("It is SPY Number");
		}
		else {
			System.out.println("It is not SPY Number");
		}
	}
}
