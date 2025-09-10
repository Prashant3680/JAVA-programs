import java.util.Arrays;

public class SumOfMatrices 
{
	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b= {{10,20,30},{40,50,60},{70,80,90}};
		sumOFMatrices(a,b);
	}
	
	public static void printMatrix(int[][] ref)
	{
		for(int i=0;i<ref.length;i++)
		{
			System.out.println(Arrays.toString(ref[i]));
		}
	}
	
	public static void sumOFMatrices(int[][] a,int[][] b)
	{
		int[][] sum=new int[a.length][a[0].length];
		
		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[i].length;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Sum of given two matrices is:");
		printMatrix(sum);
	}
}
