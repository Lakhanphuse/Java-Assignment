package PatternPrograms;

public class PatternProgram12 {

	public static void main(String[] args) {
		
		int line =4;
		int space=line-1;
		int star=1;
		int no=1;
		
		
		for(int i =0;i<line;i++) {
			
			for(int j=0;j<space;j++)
				System.out.print("\t");
			for(int k=0;k<star;k++) {
				System.out.print("\t"+no*no);
				no++;}
				
			
			System.out.println();
			star++;
			space--;
			
		}
		System.out.println("------------");
		pattern13();
	}
	
	public static void pattern13() {
		int line =5;
		int space=line-1;
		int star=1;
		
		
		
		for(int i =0;i<line;i++) {
			
			for(int j=0;j<space;j++)
				System.out.print("\t");
			for(int k=0;k<star;k++) {
				if(k%2==0) {
					System.out.print("\t"+"*");
				}else
				System.out.print("\t"+"@");
			}
				
			
			System.out.println();
			star++;
			space--;
	}
}
}
