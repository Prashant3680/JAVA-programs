import java.util.Scanner;
class MarathaFlag
{
 public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the length:");
	int n=sc.nextInt();

	for(int i=0 ; i<n ; i++)
	{
	  for(int j=0 ;j<n ; j++)
	  {
		if(j<=i && i<=n/2)
		System.out.print("* ");
		

	  }
	  System.out.println();
	}

	
 }
}