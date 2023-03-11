package Section2;

public class Student {
	
	private String sname;
	private String rollNo;
	private long cno;
	private int std;
	public String getSname() {
		return sname;
	}
	
	public String getRollNo() {
		return rollNo;
	}
	
	public long getCno() {
		return cno;
	}
	public Student(String sname, String rollNo, long cno, int std) {
		super();
		this.sname = sname;
		this.rollNo = rollNo;
		this.cno = cno;
		this.std = std;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	

}
