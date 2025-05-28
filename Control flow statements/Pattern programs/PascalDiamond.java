import java.util.Scanner;
class PascalDiamond
{ public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the length of side: ");
	int n=sc.nextInt();
	int space=n/2;
	int star=0;

	for(int i=0 ; i<=n ; i++)
	{
	  for( int j=0 ; j<=space ; j++)
	  {
		System.out.print("  ");	   
	  }
	
	for(int j=0 ; j<=star ; j++)
	{ 
		System.out.print("*   ");
	}

	if(i<n/2)
	{
	 space--;
	 star++;
	}
	else
	{
	 space++;
	 star--;
	}
	
	
	  System.out.println();

	}
 }	
}