import java.util.Scanner;
class PascalTriangleMethod
{
 public static void main(String[] args)
 {
	System.out.print("Enter the length:");
	int num=new Scanner(System.in).nextInt();
	pascalTriangle(num);
 }

 public static void pascalTriangle(int n)
 {
	for(int i=1;i<=n;i++)
	{
	  for(int j=1;j<=n;j++)
	  {
	    if(j<=n-i)
	    System.out.print("  ");
	    else
	    System.out.print("*   ");
	  }

	System.out.println();
	  
	}
 }


}