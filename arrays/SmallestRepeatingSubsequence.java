public class SmallestRepeatingSubsequence 
{
	public static void main(String[] args) 
	{
		int[] ar= {2,2,2,4,6,6,2,2,2,4,4,8,8,8,8,8,8,9};
		smallestRepeatingSubsequence(ar);
	}
	
	public static void smallestRepeatingSubsequence(int[] ref)
	{
		int index=0,count=0,minCount=ref.length;
		
		for(int i=0;i<ref.length-1;i++)
		{
			if(ref[i]==ref[i+1])
			{
				count++;
			}
			else 
			{
				if(count<minCount)
				{
						minCount=count;
						index=i;				
				}
				else if(i==ref.length-2)
				{
					index=++i;
					minCount=0;
				}
				count=0;
				
			}
			
		}
		
		System.out.println("The smallest repeating subsequence "+ref[index]+" is repeated "+minCount+" times");
		
	}
}