package PatternPrograms;

public class Char_Tri_Inverted {

	public static void main(String[] args) {
		
		char ch='E';
		for(int i=1;i<=5;i++) {
			
			char ch1=ch;
			
			for(int j=5-i;j>=0;j--) {
				
				System.out.print(ch1);
				ch1--;
				
		}
			System.out.println();
			ch--;
	}
 }
}
