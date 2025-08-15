public class SecondMinElement 
{
	public static void main(String[] args) 
	{
		int[] ar={10,3,4,5,68,76,0,-2,3};
		
		System.out.println("Second min element in array is: "+secMin(ar));
		
	}
	
	public static int secMin(int[] ref)
	{
		int min=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		
		for(int i=0;i<ref.length;i++)
		{
			if(ref[i]<secMin)
			{
				if(ref[i]<min)
				{
					secMin=min;
					min=ref[i];
				}
				else
					secMin=ref[i];
				
			}
		}
		return secMin;
		
	}
}