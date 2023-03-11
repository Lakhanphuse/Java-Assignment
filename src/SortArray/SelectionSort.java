package SortArray;

public class SelectionSort {

	public static void main(String[] args) {
		
		
		int aar[]= {7,8,3,1,2};
	
		
		for(int i=0;i<aar.length;i++)	
		{
			int min=i;
			
		
			for(int j=i+1;j<aar.length;j++)
			{

				if(aar[min]<aar[j])
				{
				     min=j;
				}
			}
			
			int temp=aar[i];
			aar[i]=aar[min];
			aar[min]=temp;
		}
		
		for(int a:aar)
			System.out.println(a);
	}
}
