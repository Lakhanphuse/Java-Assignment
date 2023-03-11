package Number;

public class AmstrongNumber11 {  

	public static void main(String[] args) {
		
		int num=153;
		//(1^3)+(5^3)+(3^3)=153
		//1124=(1^4)+(1^4)+(2^4)+(4^4)=1124= Armstrong number
		int  sum=0;
		int temp=num;
		
		
		 
		while(num!=0) {
			int r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
			
		}
		if(sum==temp) {
			System.out.println("This is Amstrong Number");
		}
		else {
			System.out.println("This is not Amstrong number");
		}
		
		System.out.println("_________________");
		
		findFactores();
		RangeAmstrong();
		rangeAmstrong();
		
	}
	public static void findFactores() {
	int a=135;
	
	for(int i=1;i<a;i++)
	{
		if(a%i==0) {
			System.out.println(i);
		}
	}
	System.out.println("__________________");
}
	
	
	public static void RangeAmstrong() {
// To find three digit number		
		for(int i=100;i<999;i++) {
			
			int a=i;
			int sum=0;
			
			while(a>0) {
				int r=a%10;
				sum=sum+(r*r*r);
				a=a/10;
			}
			if(sum==i) {
				System.out.println(i);
			}
			
		}
		System.out.println("____________________");
	}
	public static void rangeAmstrong() {
	// To find two digit amstrong no to three digit amstrong number	
		for(int i=10;i<10000;i++) {
			
			int a=i;
			int temp=a;
			int count=0;
			int sum=0;
			while(temp!=0) {
				
				temp=temp/10;
				count++;
			}
			while(a!=0) {
				
				int r=a%10;
				 sum=(int) (sum+Math.pow(r, count)); //why Math.pow because to find 2 dight count to three digit count
				 a=a/10;
			}
			if(sum==i) {
				System.out.println("Number:"+ sum);
			}
		}
	}
}
