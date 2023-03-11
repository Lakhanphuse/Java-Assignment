package Number;

public class Magic_Number {

	public static void main(String[] args) {
		
		int num=141414141;
		int count =0;
		
		while(num!=0)
		{   int n = num%10;
		   if(num==1||num==4)
		   {
			   count ++;
		   }
			
			if(num==count) {
				System.out.println(num + "Mmagic Number");
			}
		}
		
	}
}
