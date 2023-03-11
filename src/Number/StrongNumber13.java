package Number;

public class StrongNumber13 {

	public static void main(String[] args) {
		
		int num=145;
		int temp=num;
		int sum=0;
		
		  
		  while(temp!=0) {
			  
			  int r=temp%10;
			  int fact=1;
			  
			  for(int i=1;i<=r;i++) {
				  
				  fact=fact*i;
			  }
				  sum=sum+fact;
				  temp=temp/10;
		  }
		  
			  if(sum==num) {
				  System.out.println("Number is Strong Number");
			  }
			  else {
				  System.out.println("Number is not a Strong Number");
			  } 
			  
			  System.out.println("____________");
			  rangeOfStrong();
		
		}
		
	public static void rangeOfStrong() {
		
		for(int i=1;i<=10000;i++) {
			int num=i;
			int temp=num;
			int sum=0;
			
			while(temp!=0) {
				int r=temp%10;
				int fact=1;
				
				for(int j=1;j<=r;j++) {
					fact=fact*j;
				}
				sum=sum+fact;
				temp=temp/10;
			}
			
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
	}


