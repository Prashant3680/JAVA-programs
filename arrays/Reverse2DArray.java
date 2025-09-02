import java.util.Arrays;

public class Reverse2DArray 
{
	public static void main(String[] args) 
	{
		int[][] ar= {{1,2,3},{4,5,6},{7,8,9}};
		printMatrix(ar);
		System.out.println();
		reverseArray(ar);
		printMatrix(ar);
	}
	
	public static void printMatrix(int[][] ref)
	{
		for(int i=0;i<ref.length;i++)
		{
			System.out.println(Arrays.toString(ref[i]));
		}
	}
	
	public static void reverseArray(int[][] ref)
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