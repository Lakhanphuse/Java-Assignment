package String_Methods;

public class StringPalindrome{
public static void main(String[] args) {
	
	String s1="DAD";
	
	int l=s1.length();
	String rev="";
	for(int i=l-1;i>=0;i--) {
		rev=rev+s1.charAt(i);
	}
	if(s1.equals(rev)) {
		System.out.println("Palidrom Number="+rev);
	}else {
		System.out.println("Not Palindrom="+rev);
	}
}
}
