package PatternPrograms;

public class PatternProgramPyramid22 {

	public static void main(String[] args) {
		int line=5;
		int space=line-1;   
		int star=1;  
		int ch=1;
		
		
		for(int i=0;i<line;i++)
		{ 
			for(int k=0;k<space;k++)
				System.out.print(" ");
			for(int j=0;j<star;j++)
			
			{
				System.out.print(ch+"");
				
			}
			
			System.out.println();
			star+=2;
			space--;
		
	}
   }
}