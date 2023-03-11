package SortArray;

public class MergeSort {

	public static void main(String[] args) {
		
		int arr [] = {7,8,3,2,1,9};
		int n = arr.length;
		
		divide(arr, 0, n-1);
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	public static void divide(int[] arr,int si,int ei)
	{
		if(si>=ei)
		{
			return;
		}
		int mid= si+(ei-si)/2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		concur(arr,si,mid,ei);
	}
	
	public static void concur(int []arr,int si,int mid,int ei)
	{
		int [] merge= new int[ei-si+1];
		int idx1=si;
		int idx2=mid+1;
		int j=0;
		
		while(idx1<=mid && idx2<=ei)
		{
			if(arr[idx1]<arr[idx2])
			{
				merge[j]= arr[idx1];
				j++;
				idx1++;	
			}
			else {
				merge[j]=arr[idx2];
				j++;
				idx2++;
			}
		}
		while(idx1<=mid)
		{
			merge[j]=arr[idx1];
			j++;
			idx1++;
		}
		while(idx2<=ei)
		{
			merge[j]=arr[idx2];
			j++;
			idx2++;
		}
		
		for (int i = 0,j1 = si; i < merge.length; i++,j1++) {
			arr[j1] = merge[i];
		}
	}
}
