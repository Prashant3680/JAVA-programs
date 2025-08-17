import java.util.Arrays;
public class TwoPointerMerge 
{
	public static void main(String[] args) 
	{
		int[] a= {59,26,36,23,59,90,82,63};
		int[] b= {42,11,4,31,73,58,75};
		
		System.out.println(Arrays.toString(twoPointerMerge(a,b)));
	}
	
	public static int[] twoPointerMerge(int[] ref1,int[] ref2)
	{
		BubbleSortModification.bubbleSort(ref1);
		BubbleSortModification.bubbleSort(ref2);
		
		int[] ans=new int[ref1.length+ref2.length];
		
		for(int i=0,i1=0,i2=0;i<ans.length;i++)
		{
			if(i1<ref1.length && i2<ref2.length)
			{
				if(ref1[i1]<=ref2[i2])
					ans[i]=ref1[i1++];
				
				else 
					ans[i]=ref2[i2++];
			}
			else
			{
				if(i1==ref1.length)
					ans[i]=ref2[i2++];
				else
					ans[i]=ref1[i1++];
			}
			
		}
		
		return ans;
	}
}
	