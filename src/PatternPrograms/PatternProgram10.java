package PatternPrograms;

public class PatternProgram10 {

	public static void main(String[] args) {
		
		int line=6;
		int star=1;
		int space=line-1;
		
		for(int i=0;i<line;i++) 
		{
			
			for(int j=0;j<space;j++) 
				System.out.print(" ");
				
			for(int k=1;k<star;k++) 
				
				System.out.print(i);
				
			
			System.out.println();
			star++;
			space--;
		}
	}
}
