import java.util.Arrays;

public class PartialReverseMerge 
{
	public static void main(String[] args) 
	{
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {60,70,80};
		
		int[] arr3=partialReverseMerge(arr1,arr2);
		
		System.out.println(Arrays.toString(arr3));
		
	}
	
	public static int[] partialReverseMerge(int[] ref1,int[] ref2)
	{
		int[] res=new int[ref1.length+ref2.length];
		
		for(int i=0;i<res.length;i++)
		{
			if(i<ref1.length)
				res[i]=ref1[i];
			
			else
				res[i]=ref2[ref2.length-1-(i-ref1.length)];
				
		}
		
		return res;
		
	}
}