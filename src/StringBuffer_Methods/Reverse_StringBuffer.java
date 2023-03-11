package StringBuffer_Methods;

public class Reverse_StringBuffer {

	private static char[][] toChar;


	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("hello");
		
		StringBuffer reverse = new StringBuffer();
		
		for(int i=sb.length()-1;i>=0;i--)
		{
			reverse .append(sb.charAt(i));
		}
		System.out.println(reverse);
	}
	
	
}
