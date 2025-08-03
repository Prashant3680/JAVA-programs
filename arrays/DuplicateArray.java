import java.util.Arrays;

public class DuplicateArray 
{
	public static void main(String[] args) 
	{
		int[] ar1= {10,20,30,40,50};
		
		int[] ar2=duplicateArray(ar1);
		
		System.out.println(Arrays.toString(ar2));
		
	}
	
	public static int[] duplicateArray(int[] ref)
	{
		int[] dup=new int[ref.length];
		
		for(int i=0;i<ref.length;i++)
		{
			dup[i]=ref[i];
		}
		
		return dup;
		
	}
}
