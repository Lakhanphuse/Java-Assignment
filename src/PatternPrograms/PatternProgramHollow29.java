package PatternPrograms;

public class PatternProgramHollow29 {

	public static void main(String[] args) {
		
		int line=4;
		int space=line-1;
		int star=1;
		
		
		for(int i=0;i<line-1;i++)
		{
			
			for(int k=0;k<star;k++)
				if(star-1==k  )
				System.out.print("*");
				else
					System.out.print(" ");
				
			
			System.out.println();
			star++;
			space--;
		}
		for(int i=0;i<line;i++)
		{
			for(int k=0;k<star;k++)
				if(star-1==k)
				System.out.print("*");
				else
					System.out.print(" ");
			
			System.out.println();
			star--;
			space++;
		}
	}
}
