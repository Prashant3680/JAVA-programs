public class MaxElement 
{
	public static void main(String[] args) {
		
		int[] ar= {2,67,89,21,45,0,78};
		System.out.println("Maximum element in array is: "+maxElement(ar));
	}
	
	public static int maxElement(int[] ref)
	{
		int max=ref[0];
		
		for(int i=1;i<ref.length;i++)
		{
			max=max>ref[i]?max:ref[i];
		}
		return max;
	}
}