public class LongestRepeatingSubsequence 
{
	public static void main(String[] args) 
	{
		int[] ar= {1,2,2,2,5,6,0,2,2,2,4,4,8,8,8,8,8,8,9,2};
		longestRepeatingSubsequence(ar);
	}
	
	public static void longestRepeatingSubsequence(int[] ref)
	{
		int i=0,index=0,count=0,maxCount=0;
		
		for(;i<ref.length-1;i++)
		{
			if(ref[i]==ref[i+1])
			{
				count++;
			}
			else if(count>0)
			{
				if(count>maxCount)
				{
					maxCount=count;
					index=i;
				}
				count=0;
				
			}
			
		}
		
		System.out.println("The longest repeating subsequence "+ref[index]+" is repeated "+maxCount+" times");
		
	}
}