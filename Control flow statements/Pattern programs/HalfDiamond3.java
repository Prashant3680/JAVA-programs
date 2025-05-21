import java.util.Scanner;
class HalfDiamond3
{
 public static void main(String[] args)
 {
	System.out.print("Enter the length: ");
	int n=new Scanner(System.in).nextInt();
	int star=1,space=n/2;

	for(int i=1;i<=n;i++)
	{
	  for(int j=1;j<=space;j++)
	  {
	    System.out.print("  ");
	  }
	
	  for(int j=1;j<=star;j++)
	  {
	    if(j%2==1)
	    System.out.print("* ");
	    else
	    System.out.print("  ");
	  }
	System.out.println();

	  if(i<=n/2)
	  {space--;
	   star++;
	  }
	  else
	  {space++;
	   star--;
	  }

	}
 }
}