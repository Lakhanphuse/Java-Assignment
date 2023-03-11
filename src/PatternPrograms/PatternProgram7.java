package PatternPrograms;

public class PatternProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'E';
		for(int i=1;i<=5;i++) {
			 
			
			char ch1=ch;
			for(int j=5;j>=i;j--) {
				
				System.out.print(ch1);
				ch1--;
			}
			System.out.println();
			ch--;
			
		}
	}

}
