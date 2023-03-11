package SortArray;

public class MinimunArray {

	public static void main(String[] args) {
		
		
		int aar[]= {8,2,3,4,5,6,7,};
		int min=aar[0];
		
		for(int i=0;i<aar.length;i++)	
		{
			if(aar[i]<min)
			{
				min=aar[i];
				
			}
		}System.out.println(min);
	
	
	}
}
