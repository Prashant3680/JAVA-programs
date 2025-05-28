import java.util.Scanner;
class PascalTriangle
{ public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the length of side: ");
	int n=sc.nextInt();
	
	for(int i=0 ; i<=n ; i++)
	{
	  for( int space=0 ; space<=n-i ; space++)
	  {
		System.out.print("  ");	   
	  }
	
	for(int star=0 ; star<=i ; star++)
	{ 
		System.out.print("*   ");
	}
		
	  System.out.println();

	}
 }	
}