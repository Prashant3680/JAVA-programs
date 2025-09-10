public class SumOfEveryArrayElement 
{
	public static void main(String[] args) 
	{
		int[][] ar= {{1,2,3},{4,5,6},{7,8,9}};
		sumOfEveryArrayElement(ar);
	}
	
	public static void sumOfEveryArrayElement(int[][] ref)
	{
		for(int i=0;i<ref.length;i++)
		{
			int sum=0;
			for(int j=0;j<ref[i].length;j++)
			{
				sum+=ref[i][j];
			}
			
			System.out.println("Sum of all elements of array at index "+i+" is: "+sum);
		}
		
	}
}