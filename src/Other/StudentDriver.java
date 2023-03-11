package Other;

import java.util.Arrays;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student[] s1= new Student[4];
		
		s1[0] = new Student("Ram",56);
		s1[1] = new Student("Rahul",33);
		s1[2] = new Student("Rachna",78);
		s1[3] = new Student("Shreyas",12);
		
		System.out.println("Before Sorting....");
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i].sname);
		}
		System.out.println("After Sorting....");
		
		Arrays.sort(s1);
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i].sname);
		}
	}
}
