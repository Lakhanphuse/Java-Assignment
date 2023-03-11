package Hashset;

import java.util.HashSet;
import java.util.Set;

public class CheckABCD_with_hashset {

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		
		if(AngramCheck(str))
			System.out.println("String is Angram");
		else
			System.out.println("String is not Angram");
		
	}
	public static boolean AngramCheck(String str)
	{
		Set<Character> hm = new HashSet<>();
		
		for(int i=0;i<str.length();i++)
		hm.add(str.charAt(i));
			
			int count =0;
			for(Character c:hm)
				count ++;
			
		return count==26;
		
		/*or if(count==26)
		return true;
	else
		return false;*/
	
		
	}
}
