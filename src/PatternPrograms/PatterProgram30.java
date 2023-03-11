package PatternPrograms;

public class PatterProgram30 {

	public static void main(String[] args) {
		
		int line=4;
		int space=line-1;
		int star=1;
		
		for(int i=0;i<line-1;i++) {
			
			for(int k=0;k<space;k++)
				System.out.print(" ");
			for(int j=0;j<star;j++)
				System.out.print("*");
			System.out.println();
			star++;
			space--;
			
		}
		for(int i=0;i<line;i++)
		{
			for(int k=0;k<space;k++)
				System.out.print(" ");
			for(int j=0;j<star;j++)
				System.out.print("*");
			System.out.println();
			star--;
			space++;
		}
	}
}
