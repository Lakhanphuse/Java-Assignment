package Number;

public class NumberProgram1 {
	
	
	public static void main(String[] args) {

		
		System.out.println(addNumber(10));
		
	}
	
	

	public static int addNumber(int a)
	{
		if(a>=1) {
			return a +addNumber(a-1);
		}
		else {
			return 1;
		}
	}
}
