package PatternPrograms;

public class PatterProgram_In_Tri2 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			char ch='E';
			for(int j=5;j>=i;j--) {
				
				System.out.print(ch);
				ch--;
			}
			System.out.println();
		}
	}

}
