package PatternPrograms;

public class PatternProgram14 {

	public static void main(String[] args) {
		
		int line =5;
		int space=0;
		int star=5;
		int num=5;
	
		
		
		for(int i =1;i<=line;i++) {
			
			int num1=num;
			for(int j=0;j<space;j++) {
				System.out.print("  ");}
			
				
			for(int k=0;k<star;k++) { 
				System.out.print(num1+" ");}
				
			
			System.out.println();
			num--;
			star--;
			space++;
		}
	}
}
