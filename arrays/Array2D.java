import java.util.Scanner;
public class Array2D 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[][] ar=new int[3][4];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
				if(ar[i][j]<10)
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	
}