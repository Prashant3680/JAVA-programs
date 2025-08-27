import java.util.Arrays;

public class ProductOfMatrices 
{
	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b= {{10,20},{40,50},{70,80}};
		productOFMatrices(a,b);
	}
	
	public static void printMatrix(int[][] ref)
	{
		for(int i=0;i<ref.length;i++)
		{
			System.out.println(Arrays.toString(ref[i]));
		}
	}
	
	public static void productOFMatrices(int[][] a,int[][] b)
	{
		if(a[0].length!=b.length)
		{
			System.out.println("Product of given 2 matrices is not possible!");
			return;
		}
		
		int[][] prod=new int[a.length][b[0].length];
		
		for(int i=0;i<prod.length;i++)
		{
			for(int j=0;j<prod[i].length;j++)
			{
				int sum=0;
				for(int k=0;k<a[i].length;k++)
				{
					sum+=a[i][k]*b[k][j];
				}
				prod[i][j]=sum;
			}
		}
		
		System.out.println("Product of given two matrices is:");
		printMatrix(prod);
	}
}