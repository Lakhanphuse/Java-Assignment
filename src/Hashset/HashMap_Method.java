package Hashset;

import java.util.HashSet;
import java.util.Set;

public class HashMap_Method {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,1,2,3,4};
		
		Set<Integer> hs = new HashSet<>();
		
		for(int a:arr)
			hs.add(a);
		
		for(int b:hs)
			System.out.println(b);
		
}
}
