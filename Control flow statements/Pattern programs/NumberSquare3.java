import java.util.Scanner;
class NumberSquare3
{ public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	int count=1;
	for(int i=1;i<=num;i++)
	{
	 for(int j=1;j<=num;j++)
	{ if(count<10)
 	  System.out.print(" ");
	 System.out.print(count++ +" ");
	}

	 System.out.println();
	}
 }
}