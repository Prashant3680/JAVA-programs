public class SecondMaxElement 
{
	public static void main(String[] args) 
	{
		int[] ar={10,3,4,5,68,76,0,-2,3};
		
		System.out.println("Second max element in array is: "+secMax(ar));
		
	}
	
	public static int secMax(int[] ref)
	{
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		
		for(int i=0;i<ref.length;i++)
		{
			if(ref[i]>secMax)
			{
				if(ref[i]>max)
				{
					secMax=max;
					max=ref[i];
				}
				else
					secMax=ref[i];
				
			}
		}
		return secMax;
		
	}
	
}
