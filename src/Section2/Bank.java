package Section2;

import java.util.Scanner;

public class Bank {

	Account a;

	public void creatAccount(Account a) {

		if (this.a == null) {
			this.a = a;
			System.out.println("Bank account created successfully...");
		} else {
			System.out.println("Account already created...");
		}
	}

	public void deleteAccount() {

		if (this.a == null) {
			System.out.println("Account not created...");
		} else {
			this.a = null;
			System.out.println("Account deleted successfully...");
		}
	}

	public void displayAccount() {

		if (this.a == null) {
			System.out.println("Account not created...");
		} else {
			System.out.println("Account holder name:" + a.getName());
			System.out.println("Contact no:" + a.getCno());
			System.out.println("Email:" + a.getEmail());
			System.out.println("City:" + a.getCity());

		}
	}

	public void updateAccount() {

		if (this.a == null) {
			System.out.println("Account not created...");
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the pin");
			int pin = sc.nextInt();
			if (pin == a.getPin()) {
				System.out.println("Enter the Account holder name");
				String name = sc.next();
				a.setName(name);
				System.out.println("Enter the Contact no");
				String cno = sc.next();
				if (mobileNoValidate(cno)) {
					a.setCno(cno);
					System.out.println("Enter the Account Number");
					long acno = sc.nextLong();
					a.setAcno(acno);
					System.out.println("Enter the Email Id");
					String email = sc.next();
					a.setEmail(email);
					System.out.println("Enter the city name");
					String city = sc.next();
					a.setCity(city);
					System.out.println("Account Updated Successfully...");
				} else {
					System.out.println("Wrong Pin");
				}
			}
		}
	}

	public void deposit() {
		if (this.a == null) {
			System.out.println("Account not created");
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the pin");
			int pin = sc.nextInt();
			if (pin == a.getPin()) {
				System.out.println("Enter the Deposit ammount");
				int amount = sc.nextInt();
				System.out.println(amount + a.getBalance());
				a.setBalance(a.getBalance() + amount);
			} else {
				System.out.println("Wrong pin");
			}
		}
	}

	public void withdraw() {
		if (this.a == null) {
			System.out.println("Account not Created");
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the pin");
			int pin = sc.nextInt();
			if (pin == a.getPin()) {
				System.out.println("Enter the amount Withdraw");
				int amount = sc.nextInt();
				if (amount > a.getBalance()) {
					System.out.println("Insufficient Balance" + a.getBalance());

				} else {
					System.out.println(a.getBalance() - amount);
					a.setBalance(a.getBalance() - amount);
				}
			} else {
				System.out.println("Wrong pin..");
			}

		}
	}

	public void balanceEnquiry() {

		if (this.a == null) {
			System.out.println("Account not created");
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the pin");
			int pin = sc.nextInt();
			if (pin == a.getPin()) {
				System.out.println("Account Balance" + a.getBalance());
			}
		}
	}

	public boolean mobileNoValidate(String cno) {
		if (cno.length() == 10) {
			return true;
		} else {
			System.out.println("Invalid Input");
			System.out.println("You want to proceed again yes or no");
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			if (input.equals("Yes")) {
				updateAccount();
			} else {
				System.out.println("Thank You visit again");
			}
			return false;
		}
	}

}
