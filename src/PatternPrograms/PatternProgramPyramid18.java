package PatternPrograms;

public class PatternProgramPyramid18 {

	public static void main(String[] args) {
		
		int line=5;
		int space=line+1;
		int star=5;
		int p=5;
		
		for(int i=0;i<line;i++)
		{
			for(int k=0;k<space;k++)
				System.out.print(" ");
			for(int j=0;j<star;j++)
			{
				System.out.print(p+" ");
				
			}
			System.out.println();
			p--;
			star--;
			space++;
		}
	}
}
