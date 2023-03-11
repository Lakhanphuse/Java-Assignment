package PatternPrograms;

import java.util.Iterator;

public class PatternProgram1 {
	
	public static void main(String[] args) {
		
		for(int i=0;i<4;i++) {
			
			int ch=i;
			
			for(int j=0;j<4; j++) {
				
				System.out.print(ch);
				ch++;
				
				if(ch==4) {
					ch=0;
				}
			}
			System.out.println();
		}
	}

}
