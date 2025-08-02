public class EvenElements 
{
	public static void main(String[] args) 
	{
		int[] arr= {11,22,33,47,54,61,73};
		System.out.print("[");
		int ct=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{   ct++;
				if(ct>1)
					System.out.print(",");
					
				System.out.print(arr[i]);
				
			}
		}
		System.out.print("]");
	}
}
