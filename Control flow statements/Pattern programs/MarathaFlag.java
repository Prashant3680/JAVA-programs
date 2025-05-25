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
	  for(int j=0 ;j<i*2 ; j++)
	  {
		System.out.print("* ");
		
	  }
	  if(i<n-1)
	  System.out.println();
	}

	for(int i=0 ; i<n ; i++)
	{
	  for(int j=0 ; j<i*2 ; j++)
	  {
		System.out.print("* ");
		
	  }
	  System.out.println();
	}

	for(int i=0; i<n*2 ;i++)
	System.out.println("* *");


	
 }
}