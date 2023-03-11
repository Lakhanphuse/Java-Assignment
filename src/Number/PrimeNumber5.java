package Number;

public class PrimeNumber5 {

	public static void main(String[] args) {
		
	/*	int a=13;int count=0;
		
		for(int i=1;i<=a;i++) {
			
			if(a%i==0)
				count ++;
		}
		if(count==2)
			System.out.println("Number is prime Number");
		else
			System.out.println("Number is not Prime Number");*/
		
		int n=0;
		
	for(int i=1;i<=1000;i++)
		
	{  
		int a=i;int count =0; 
		
		for(int j=1;j<=i;j++) {
			
			if(i%j==0)
				count++;
		}
		if(count==2 || count==1) {
			System.out.println(a);
		n++;}	
		
	}
	System.out.println("total Prime No :"+ n);
		
	}  
}
