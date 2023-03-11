package Section1;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
	
	public static void main(String[] args) {
		
		System.out.println(maxPath("abcadeaj"));
		
		
		
	}
	public static int maxPath(String s) {
	    Map<Character, Integer> last_index = new HashMap<>();
	    int max_path = -1;

	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (last_index.containsKey(c)) {
	            int distance = i - last_index.get(c) - 1;
	            max_path = Math.max(max_path, distance);
	        }
	        last_index.put(c, i);
	    }

	    return max_path;
	}

}
