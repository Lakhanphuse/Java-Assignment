package PatternPrograms;

public class PatternProgram13 {

	public static void main(String[] args) {
		
		int line =5;
		int space=line+1;
		int star=5;
	
		
		
		for(int i =1;i<=line;i++) {
			
			for(int j=0;j<space;j++) {
				System.out.print(" ");}
			
				
			for(int k=0;k<star;k++) { 
				System.out.print(i);}
				
			
			System.out.println();
			star--;
			space++;
			
		
		}
	}
	}

