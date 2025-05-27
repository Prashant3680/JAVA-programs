import java.util.Scanner;
class NumberSquare4
{ public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	char ch=97;
	int count=1;

	for(int i=1; i<=num ;i++)
	{
	 for(int j=1 ; j<=num; j++)
	 {
	  if(i%2==0)
	  System.out.print(ch++ + "  ");
	  else
	  {
	   System.out.print(count++ + " ");
	   if(count<10)
	   System.out.print(" ");
	  }	 
	 }
	System.out.println();

	}
 }
}