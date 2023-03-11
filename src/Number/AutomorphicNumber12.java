package Number;

public class AutomorphicNumber12 {

	public static void main(String[] args) {
// Automorphic num means
// 5=5*5=25 means when we square the number the last digit match the number	
		int num=625;
		int sq= num*num;
		int temp=num;
		
		int l=0; // to find lenght another way (""+num).length();
		
		while(temp!=0) {
			temp=temp/10;
			l++;
		}
		
        int end=(int) (sq % Math.pow(10, l));
		
		if(num==end) {
			System.out.println("It is Automorphic number");
		}
		else {
			System.out.println("It is not Automorphic Number");
		}
		System.out.println("_________________");
		
		rangeOfAutomorphic();
		
	}
	public static void rangeOfAutomorphic() {
		
		for(int i=1;i<10000;i++) {
			int num=i;
			int sq=num*num;
			int temp=num;
			int l=0;
			while(temp!=0) {
				temp=temp/10;
				l++;
			}
			int end=(int)(sq% Math.pow(10, l));
			if(num==end) {
				System.out.println(num);
			}
		}
	}
}
