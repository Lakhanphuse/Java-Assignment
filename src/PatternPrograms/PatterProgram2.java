package PatternPrograms;

public class PatterProgram2 {
	
	public static void main(String[] args) {
		
		char[] arr= {'S','T','A','R'};   //arr1
		
		for (int i = 0; i < arr.length; i++) { //i<4
			
			int a=i; //ch=i
			
			for (int j = 0; j < arr.length; j++) {//j<4
				System.out.print(arr[a]);   //arr1[ch]
				a++;                             //ch++;
				if(a>=arr.length) {               //ch=0;
					a=0;
				}
				
			}
			System.out.println();
		}
	}

}
