package Hashset;

public class Split_Function {

	public static void main(String[] args) {
		
		String str = "My name is Programming !!";
		
		String [] arr = str.split(" ",0);
		
		
		for(String s:arr)
		System.out.println(s);
		
		
		Methods();
	}
	
	public static void Methods()
	{
		String str = "My Name Is Lakhan";
		
		String [] arr = str.split(" ",0 );
		
		for(String s:arr)
			System.out.println(s.replace(s.charAt(0),s.toLowerCase().charAt(0)) );
		
		for(int i=arr.length -1;i>=0;i--)
		{
			System.out.println(arr[i]);
			
		}
		
	}
}
