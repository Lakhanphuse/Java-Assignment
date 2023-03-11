package PatternPrograms;

public class PatterProgram3 {
	public static void main(String[] args) {
		int line=4;
		
		for(int i=0;i<line;i++) {
			
			for(int j=i;j>=0;j--) {
				
				System.out.print((char)(65+j));
			}
			System.out.println();
		}
	}

}
