package Number;

public class NumberProgram2 {
	
	
	public static void main(String[] args) {
		//int num=5;
		int fact=1;
		
	/*while(num!=0) {
		
		fact=fact*num;
		num--;
	}
	System.out.println(fact);*/
		
		/*for(int num=5;num>1;num--) {
			 fact=fact*num;
		}
		System.out.println(fact);*/
		
		System.out.println(fact(5));
		 
		
	}
	public static int fact(int a){
		
		if(a>=1) {
			return a * fact(a-1);
		
		}
		else {
			return 1;
		}
	}
	

}
