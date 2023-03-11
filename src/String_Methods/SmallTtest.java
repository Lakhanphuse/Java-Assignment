package String_Methods;

import java.util.Scanner;

public class SmallTtest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dummy Text");
		
		String st1 = sc.next();
		int count = 0;
		int n = st1.length();
		
		for(int i=0;i<n;i++)
		{
		if(st1.charAt(i)=='a'|| st1.charAt(i)=='A') {
			count++;
		}
			
		}
		System.out.println(count );
		
	}
}
