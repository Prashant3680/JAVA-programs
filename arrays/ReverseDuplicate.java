import java.util.Arrays;

public class ReverseDuplicate
{
	public static void main(String[] args) 
	{
		int[] ar1= {10,20,30,40,50};
			
		int[] ar2=reverseDuplicate(ar1);
			
		System.out.println(Arrays.toString(ar2));
			
	}
		
	public static int[] reverseDuplicate(int[] ref)
	{
		int[] dup=new int[ref.length];
			
		for(int i=0;i<ref.length;i++)
		{
  			dup[i]=ref[ref.length-i-1];
		}
			
		return dup;

	}

}
