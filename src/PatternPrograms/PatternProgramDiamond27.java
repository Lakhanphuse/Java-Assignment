package PatternPrograms;

public class PatternProgramDiamond27 {

	public static void main(String[] args) {
		

		int line=6;
		int space=line-1;
		int star=1;
		
		
		for(int i=0;i<line-1;i++)
		{
			
			for(int j=0;j<space;j++)
				System.out.print(" ");
			
			for(int k=0;k<star;k++)
				if(k==0||star-1==k)
					System.out.print("*");
				else if(k==1||star-2==k)
					System.out.print("*");
				else
					System.out.print(" ");
			
			
			System.out.println();
			star+=2;
			space--;
		}
		
		
		
	}
}
