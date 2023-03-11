package String_Methods;

public class Reverse_String {

	public static void main(String[] args) {
		
		String s1 = "lakhan";
		
		int l= s1.length()-1;
		
		while(l>-1)
		{
			System.out.print(s1.charAt(l));
			l--;
		}
		System.out.println("----------");
		AnotherMethod();
		System.out.println("-----------");
		anotherMethod();
		
	}
	public static void AnotherMethod() {
		
		String s1 = "Cup";
		
		String reverse =" ";
		
		for(int i=s1.length()-1;i>=0;i--)
			reverse+=s1.charAt(i);
		
		System.out.println("Reverse of "+ s1 +" is"+ reverse);
	}
	public static void anotherMethod() {
		
		String st1 = "Programming";
		int n = st1.length();
		
		
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(st1.charAt(i));
		}
	}
}
