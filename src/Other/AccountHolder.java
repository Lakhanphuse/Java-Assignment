package Other;

import java.util.Scanner;

public class AccountHolder {

	
    static int id;
    static String name;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Offers o = new Offers();
		boolean exit = true;
		
		while (exit) {
			
			System.out.println("Please Select the Bank \n1.Icici Bank \n2.HDFC bank \n3.SBI Bank");
			System.out.println("----------------");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:{
				System.out.println("Discount for Icici Bank");
				o.getDisForIcici(new Account(id,name));
			}
			break;
			case 2:{
				System.out.println("Discount for HDFC bank");
				o.getDisForHDFC();
			}
			break;
			case 3:{
				System.out.println("Discount For SbI bank");
				o.getDisforSBI();
			}
			break;
			case 4:{
				System.out.println("Not Supported");
			}
			}
		}
		
		
		
		
		
		

	}

}
