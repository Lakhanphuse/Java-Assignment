package PatternPrograms;

public class PatternProgram25 {
	public static void main(String[] args) {
		

		int line=4;
		int space=line-1;
		int star=1;
		
		for(int i=0;i<line-1;i++)
		{
			
			for(int j=0;j<space;j++)
				System.out.print(" ");
			
			for(int k=0;k<star;k++)
				if(k==0||star-1==k)
					System.out.print("*");
				else
					System.out.print(" ");
			
			System.out.println();
			star+=2;
			space--;
		}
		
		for(int i=0;i<line;i++) 
		{
			
			for(int j=0;j<space;j++)
				System.out.print(" ");
			
			for(int k=0;k<star;k++)
				if(k==0||star-1==k)
					System.err.print("*");
				else
				System.out.print(" ");
			
			System.out.println();
			star-=2;
			space++;
		}
	}

}
