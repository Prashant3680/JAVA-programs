import java.util.Arrays;
public class MatrixRotation 
{
	public static void main(String[] args) 
	{
		int[][] ar= {{1,2,3},{4,5,6},{7,8,9}};
		printMatrix(ar);
		matrixRotation(ar);
		System.out.println();
		printMatrix(ar);
	}
	
	public static void printMatrix(int[][] ref)
	{
		for(int i=0;i<ref.length;i++)
		{
			System.out.println(Arrays.toString(ref[i]));
		}
	}
	
	public static void matrixRotation(int[][] ref)
	{
		transposeMatrix(ref);
		reverseMatrix(ref);
	}
	
	public static void transposeMatrix(int[][] ref)
	{
		for(int i=0;i<ref.length;i++)
		{
			for(int j=0;j<ref[i].length;j++)
			{
				if(j>i)
				{
					int temp=ref[i][j];
					ref[i][j]=ref[j][i];
					ref[j][i]=temp;
				}
			}
		}
	}
	
	public static void reverseMatrix(int[][] ref)
	{
		for(int i=0;i<ref.length;i++)
		{
			for(int j=0;j<=ref[i].length/2;j++)
			{
				int temp=ref[i][j];
				ref[i][j]=ref[i][ref[i].length-1-j];
				ref[i][ref[i].length-1-j]=temp;
				
			}
		}
	}
	
	
}
