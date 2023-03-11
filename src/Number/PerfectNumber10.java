package Number;

public class PerfectNumber10 {

	public static void main(String[] args) {
		
		int sum=0;
		int a=6;
		
		for(int i=1;i<a;i++)  //perfect Number means addition of factors are equal to that number 
		{
		
			if(6%i==0) {
				sum=sum+i;
				
			
		}
		    
	}if(a==sum) {
		System.out.println("This number is perfect Number"+ a);
    }
    else {
    	System.out.println("This is not a perfect number");
    }
	
	perfect();
    
   
	}
	
	public static void perfect() {
        
		
		for(int i=1;i<10000;i++) {
			 int a=i;
				int sum=0; //why in sum=0;because we have to reinitialize sum=0 in evry value
			
			for(int j=1;j<a;j++) {
				
				if(a%j==0) {
					sum=sum+j;
				}
			}
			if(a==sum) {
			System.out.println("Number: "+ a);
			}
		}
		
	}
}
