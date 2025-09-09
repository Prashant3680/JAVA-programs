public class SumOfDiagonalElements 
{
	public static void main(String[] args) 
	{
		int[][] ar= {{1,2,3},{4,5,6},{7,8,9}};
		sumOfDiagonalElements(ar);
	}
	
	public static void sumOfDiagonalElements(int[][] ref)
	{
		int sum=0;
		for(int i=0;i<ref.length;i++)
		{
			for(int j=0;j<ref[i].length;j++)
			{	
				if(i==j || i+j==ref.length-1)
				sum+=ref[i][j];
			}
		}
		System.out.println("Sum of all diagonal elements of given 2D arrays is: "+sum);
	}
}