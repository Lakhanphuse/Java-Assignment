package Section2;

public class User {

	private String uname;
	private int cno;
	private String status;
	private int pswd;
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPswd() {
		return pswd;
	}

	public void setPswd(int pswd) {
		this.pswd = pswd;
	}

	public User(String uname, int cno, String status, int pswd) {
		super();
		this.uname = uname;
		this.cno = cno;
		this.status = status;
		this.pswd = pswd;
	}
	
}
