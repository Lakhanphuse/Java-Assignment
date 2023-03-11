package Other;

public class Student implements Comparable {
      
	String sname;
	int sid;
	
	public Student(String sname,int sid)
	{
		this.sid=sid;
		this.sname=sname;
	}
	public String toString()
	{
		return"Student NAME:"+ sname + "Student Sid:"+ sid;
	}
	public boolean equals(Object O)
	{
		Student s1=(Student )O;
		return this.sname.equals(s1.sname) && this.sid==s1.sid;
		
	}
	public int compareTo(Object O)
	{
		Student s1=(Student)O;
		
		if(this.sid==s1.sid)
		{
			return 0;
		}
		else if(this.sid>s1.sid)
		{
			return -45;
		}
		else {
			return 3;
		}
	}
}
