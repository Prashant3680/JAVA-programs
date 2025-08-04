public class ElementSum 
{
	public static void main(String[] args) 
	{
		int[] ar= {2,34,13,89,65,39,0,55};
		System.out.println("Total sum of all the elements of an array is: "+elementSum(ar));
		
	}
	
	public static int elementSum(int[] ref)
	{
		int sum=0;
		for(int i=0;i<ref.length;i++)
		{
			sum+=ref[i];
		}
		
		return sum;
	}
	
}
