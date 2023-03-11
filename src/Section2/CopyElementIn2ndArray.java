package Section2;

public class CopyElementIn2ndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40,50};
		
		int b[] = new int[a.length];
		
		for(int i=0; i<a.length ; i++) {
			
			b[i]=a[i];
		}
		for(int i =0; i<a.length;i++) {
			
			System.out.println(b[i] + " ");
		}
		
	}

}
