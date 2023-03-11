package Other;

import java.util.Objects;

public class Book implements Comparable {
    String bname;
    int bid;
    
    public Book(String bname,int bid) {
    	this.bid=bid;
    	this.bname=bname;
    }
    
    
   


	@Override
	public int hashCode() {
		return Objects.hash(bid, bname);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bid == other.bid && Objects.equals(bname, other.bname);
	}
    public String toString() {
    	return"Book Name:" + bname;
    }
    public int compareTo(Object o) {
    	Book b1=(Book)o;
    	return this.bname.compareTo(b1.bname);
    }
    
    

}
