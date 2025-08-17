import java.util.Arrays;

public class TwoPointerMergeSameAray 
{
	public static void main(String[] args) 
	{
		int[] ar= {9,15,24,42,59,61,78,88,90,5,18,31,37,54,65,74,82};
		
		System.out.println(Arrays.toString(twoPointerSort(ar)));
	}
	
	public static int[] twoPointerSort(int[] ref)
	{	
		int[] ans=new int[ref.length];
		int i=0,i1=0,i2=1;
		while(ref[i1]<ref[i2])
		{
			i1++;
			i2++;
		}
		
		int end=i1;
		i1=0;
		
		while(i<ans.length)
		{
			if(i1<=end && i2<ref.length)
			{
				if(ref[i1]<ref[i2])
					ans[i++]=ref[i1++];
				else
					ans[i++]=ref[i2++];
			}
			
			else
			{
				if(i1>end)
					ans[i++]=ref[i2++];
				else
					ans[i++]=ref[i1++];
			}
		}
		
		return ans;
	}
}