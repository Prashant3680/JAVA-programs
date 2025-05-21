import java.util.Scanner;
class HollowDiamond
{ public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the length of square: ");
	int n=sc.nextInt();

	for(int i=0 ; i<=n ; i++)
	{
	  for( int j=0 ; j<=n ; j++)
	  {
	   if( j==n/2+i && i<=n/2 || j==n/2-i && i<=n/2||
	       j==i-n/2 && i>=n/2 || j==n*3/2-i && i>=n/2 )
	   {
	   System.out.print("* ");
	   }
	   else
	   {
	   	System.out.print("  ");
	   }
	  }
	  System.out.println();

	}
 }	
}