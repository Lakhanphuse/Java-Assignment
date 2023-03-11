package Other;

import java.util.Arrays;

public class BookDriver {
public static void main(String[] args) {
	
	Book[]b1=new Book[5];
	
	b1[0]=new Book("java",25);
	b1[1]=new Book("SQL",12);	
	b1[2]=new Book("Python",30);
	b1[3]=new Book("C",20);
	b1[4]=new Book("HTML",45);
	
	for(int i=0;i<b1.length;i++) {
		
		System.out.println(b1[i]);
	}
	System.out.println("-------------------");
	
	Arrays.sort(b1);
	for(int i=0;i<b1.length;i++) {
		System.out.println(b1[i]);
	}
  }
}
