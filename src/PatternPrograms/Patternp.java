package PatternPrograms;

public class Patternp {
	public static void main(String[] args) {
		
		int n= 5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(i>=j) {
					if(j%2==0) {
						System.out.print("@");
						
					}else {
						System.out.print("*");
				}
			}else{
				System.out.print(" ");
				}
			}System.out.println();
			
		}
	}

}

