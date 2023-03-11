package String_Methods;

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str1="DAD";
		 String str2 ="";  //null we also take
		 
		 for(int i=str1.length()-1;i>=0;i--)
		 {
			 str2+=str1.charAt(i);
			 
		 }
		 if(str1.equals(str2)) {
		 
			 System.out.println(str1+ " String is Palidrome");
				 }
		 else {
			 System.out.println("String is not palindrome");
		 }
		 
		 antherMethod();
	}
	public static void antherMethod() {
		
		String str = "lakhan";
		char[] ch= str.toCharArray();
	
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
