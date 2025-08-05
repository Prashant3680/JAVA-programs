import java.util.Arrays;

public class ReverseArray 
{
	public static void main(String[] args) {
		
		int[] ar= {10,20,30,40,50};
		
		for(int i=0;i<ar.length/2;i++)
		{
			ar[i]=ar[i]+ar[ar.length-1-i];
			ar[ar.length-1-i]=ar[i]-ar[ar.length-1-i];
			ar[i]=ar[i]-ar[ar.length-1-i];
		}
		
		
		System.out.println(Arrays.toString(ar));
	}
	
}
