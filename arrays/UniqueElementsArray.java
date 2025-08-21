import java.util.Arrays;
public class UniqueElementsArray 
{
	public static void main(String[] args) 
	{
		int[] ar={2,45,76,2,45,7,8,44,61,76,90,79};
		System.out.println(Arrays.toString(uniqueElementArray(ar)));
		
	}
	public static int[] uniqueElementArray(int[] ref)
	{
		int[] ct=markDuplicates(ref);
		
		int[] ans=new int[ref.length-ct[ref.length]];
		
		for(int i=0,j=0;i<ref.length;i++)
		{
			if(ct[i]==0)
				ans[j++]=ref[i];
		}
		
		return ans;
	}
	
	public static int[] markDuplicates(int[] ref)
	{
		int[] ct=new int[ref.length+1];
		int count=0;
		
		for(int i=0;i<ref.length;i++)
		{
			if(ct[i]!= -1)
			{
				for(int j=i+1;j<ref.length;j++)
				{
					if(ref[i]==ref[j])
					{
						ct[j]=-1;
						ct[i]=-1;
					}
				}
			}
			
		}
		
		for(int i=0;i<ref.length;i++)
		{
			if(ct[i]==-1)
				count++;
		}
		
		ct[ref.length]=count;
		return ct;
	}
	
	
}