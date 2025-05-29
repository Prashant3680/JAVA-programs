import java.util.Scanner;
class Rangoli
{ public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length:");
		int n=sc.nextInt();

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==n/4 || i==(n*3)/4 || j==n/4 || j==(n*3)/4 ||
                                   i==0 && j<n/4 || j==0 && i<n/4 || 
                                   i==0 && j>(n*3)/4 || j==n-1 && i<n/4 ||
                                   i==n-1 && j<n/4 || j==0 && i>(n*3)/4 ||
                                   i==n-1 && j>(n*3)/4 || j==n-1 && i>(n*3)/4) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}