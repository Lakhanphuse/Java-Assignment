package Section2;

public class Account {
	private String name;
	private String cno;
	private int acno;
	private String email;
	private String city;
	private int balance;
	private int pin;
	
	public Account(String name, String cno, int acno, String email, String city, int balance, int pin) {
		
		this.name = name;
		this.cno = cno;
		this.acno = (int) acno;
		this.email = email;
		this.city = city;
		this.balance = balance;
		this.pin = pin;
		
		
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno2) {
		this.cno = cno2;
	}
	public long getAcno() {
		return acno;
	}
	public void setAcno(long acno) {
		this.acno = (int) acno;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	
	
	public int getPin() {
		return pin;
	}


}
