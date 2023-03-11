package StringBuffer_Methods;

public class StringsBuffer_Method_Practice {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer ("Lakhan");
		StringBuffer sb1 = new StringBuffer("Welcome");
		
		System.out.println(sb.capacity());//It shows 22 becoz the default capecity is 16+6=22;
		System.out.println(sb.length());
		System.out.println(sb.append(" World"));
		System.out.println(sb.charAt(3));
		System.out.println(sb.insert(6, " &"));
		System.out.println(sb.delete(2, 8));
		System.out.println(sb1.capacity());
		System.out.println(sb1.substring(3));
		System.out.println(sb1.substring(1,6));
		System.out.println(sb1.replace(2, 5, "java"));
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		sb1.setCharAt(3, 'C');
		System.out.println(sb1);
		System.out.println(sb1.deleteCharAt(3));
		System.out.println(sb1.reverse());
		System.out.println(sb);
		sb.setLength(12);
		
		
		
		
		
	}
}
