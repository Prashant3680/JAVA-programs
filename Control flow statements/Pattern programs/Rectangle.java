import java.util.Scanner;
class Rectangle
{ public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the length of rectangle: ");
	int l=sc.nextInt();
	System.out.print("Enter the breadth of rectangle:");
	int b=sc.nextInt();

	for(int i=0 ; i<b ; i++)
	{
	  for( int j=0 ; j<l ; j++)
	  {
	   
	   System.out.print("* ");
	   
	  }
	  System.out.println();

	}
 }	
}