import java.util.Arrays;
public class QuickSort 
{
	public static void main(String[] args) 
	{
		int[] ar= {57,68,90,32,89,5,59,21,9,57,34,8};
		quickSort(ar,0,ar.length-1);
		System.out.println(Arrays.toString(ar));
	}
	
	public static void quickSort(int[] a,int start,int end)
	{
		if(start<end)
		{
			int index=partition(a,start,end);
			quickSort(a,start,index-1);
			quickSort(a,index+1,end);
		}
	}

	public static int partition(int[] a,int start,int end)
	{
		int i=start,j=end;
		int ref=a[start];
		while(i<j)
		{
			while(i<end && a[i]<=ref)
			{
				i++;
			}
			
			while(j>start && a[j]>ref)
			{
				j--;
			}
			
			if(i<=j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			else
			{
				break;
			}
		}
		
		int temp=a[start];
		a[start]=a[j];
		a[j]=temp;
		
		return j;
	}
	
}