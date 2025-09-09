public class SumOfBorderElements 
{
	public static void main(String[] args) 
	{
		int[][] ar= {{1,2,3},{4,5,6,7},{7,8,9}};
		sumOfBorderElements(ar);
	}
	
	public static void sumOfBorderElements(int[][] ref)
	{
		int sum=0;
		for(int i=0;i<ref.length;i++)
		{
			for(int j=0;j<ref[i].length;j++)
			{
				if(i==0 || j==0 || i==ref.length-1 || j==ref[i].length-1)
				sum+=ref[i][j];
			}
		}
		System.out.println("Sum of all border elements of given 2D array is: "+sum);
	}
}