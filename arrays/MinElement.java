public class MinElement 
{
	public static void main(String[] args)
	{
		
		int[] ar= {2,67,89,21,45,0,78};
		System.out.println("Minimum element in array is: "+minElement(ar));
	}
	
	public static int minElement(int[] ref)
	{
		int min=ref[0];
		
		for(int i=1;i<ref.length;i++)
		{
			min=min<ref[i]?min:ref[i];
		}
		return min;
	}
}
