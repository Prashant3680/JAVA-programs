import java.util.Arrays;

public class SeparatingPositiveNegative 
{
	public static void main(String[] args) {
		
		int[] ar= {23,-4,56,8,67,-9,-5,15,4};
		separatePositiveNegative(ar);
		System.out.println(Arrays.toString(ar));
	}
	
	public static void separatePositiveNegative(int[] ref)
	{
		int i=0,j=ref.length-1;
		while(i<j)
		{
			while(ref[i]<0)
			{
				i++;
			}
			
			while(ref[j]>=0)
			{
				j--;
			}
			
			if(i<j)
			{
				int temp=ref[i];
				ref[i]=ref[j];
				ref[j]=temp;
			}
				
		}
	}
}