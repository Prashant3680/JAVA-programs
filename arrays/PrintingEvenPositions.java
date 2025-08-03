public class PrintingEvenPositions 
{
	public static void main(String[] args) 
	{
		int[] ar= {10,20,30,40,50};
		printEvenPositionElements(ar);
	}
	
	public static void printEvenPositionElements(int[] ar)
	{
		System.out.print("[");
		
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0)
			{	System.out.print(ar[i]);
			    
				if(i<ar.length)
				System.out.print(",");
			}
			
		}
		
		System.out.print("]");
	}
}
