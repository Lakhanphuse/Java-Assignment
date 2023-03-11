package PatternPrograms;

public class PatternProgramPyramid19 {

	public static void main(String[] args) {
		
		
		int line=5;
		int space=line+1; // int space=0 because to in 1st line there is no
		int star=5;        // spaces so, we used space=o also....
		char ch='E';
		
		for(int i=0;i<line;i++)
		{// char ch='E'-'i'
			char ch1=ch;
			for(int k=0;k<space;k++)
				System.out.print(" ");
			for(int j=0;j<star;j++)
			{
				System.out.print(ch1+" ");
				ch1--;
				//System.out.print((char)(ch-j))
			}
			System.out.println();
		     ch--;
			star--;
			space++;
		
	}
}
}
