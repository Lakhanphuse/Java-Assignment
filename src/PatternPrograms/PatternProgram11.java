package PatternPrograms;

public class PatternProgram11 {
public static void main(String[] args) {
	
	int line =4;
	int space=line-1;
	int star=1;
	int no=2;
	
	for(int i=0;i<line;i++) {
		
		for(int j=0;j<space;j++)
			System.out.print("\t");
		for(int k=0;k<star;k++) {
			System.out.print("\t"+ no);
			no+=2;}
		
		System.out.println();
		star++;
		space--;
	}
}
}
