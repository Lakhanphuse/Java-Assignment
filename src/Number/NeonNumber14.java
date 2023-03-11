package Number;

public class NeonNumber14 {

	public static void main(String[] args) {
		
		int num=9;
		int sq=num*num;
		int sum=0;
			
		while(sq!=0) {
			int r=sq%10;
			sum=sum+r;
			sq/=10;		
		}
		
		if(sum==num) {
			System.out.println("It is Neon Number");
		}
		else {
			System.out.println("It is not Neon Number");
		}
		
		rangeOfNeon();
		
	}
	public static void rangeOfNeon() {
		
		for(int i=1;i<1000;i++) {
		
			int num=i;
			int sq=num*num;
			int sum=0;
				
			while(sq!=0) {
				int r=sq%10;
				sum=sum+r;
				sq/=10;		
			}
			
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
}
