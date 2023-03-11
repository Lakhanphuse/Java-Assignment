package String_Methods;

public class Strings_Method_Practise {

	public static void main(String[] args) {
		
		String s1 = "Lakhan";
		String s2 = " Phuse";
		String s3 = "LAKHAN";
		String s4 = "Lakhan";
		String s5 = "lakhan";
		String s6 = "";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat(s2)); // If space require give when you decleard string
		System.out.println(s2.trim());     // Trim is removing Space At 1st index of phuse(s2)
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1, 5));
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('k'));
		System.out.println(s1.indexOf('a',3));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.indexOf('L', 5));
		System.out.println(s1.indexOf('k', 4));
		System.out.println(s1.length());
		System.out.println(s1.lastIndexOf('h'));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s1.contains(s4));
		System.out.println(s6.isEmpty());  // If String is empty then it gives true as Output
		
		
	}
}
