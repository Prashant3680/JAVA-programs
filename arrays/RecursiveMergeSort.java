import java.util.Arrays;
public class RecursiveMergeSort
{
	public static void main(String[] args) 
	{
		int[] ar= {23,56,43,78,9,13,56,78,85,29,93};
		mergeSort(ar,0,ar.length-1);
		System.out.println(Arrays.toString(ar));
	}
	
	public static void mergeSort(int[] ref,int start,int end)
	{
		if(start<end)
		{	int mid=(start+end)/2;
			mergeSort(ref,start,mid);
			mergeSort(ref,mid+1,end);
			merge(ref,start,mid,end);
		}
	}
	
	public static void merge(int[] ref,int start,int mid,int end)
	{
		int[] ans=new int[ref.length];
		
		int i=start,j=mid+1,k=start;
		
		while(k<=end)
		{
			if(i<=mid && j<=end)
			{
				if(ref[i]<ref[j])
					ans[k++]=ref[i++];
				else
					ans[k++]=ref[j++];
			}
			else
			{
				if(i>mid)
					ans[k++]=ref[j++];
				else
					ans[k++]=ref[i++];
			}
		}
		
		for(int l=start;l<=end;l++)
		{
			ref[l]=ans[l];
		}
	}
	
}