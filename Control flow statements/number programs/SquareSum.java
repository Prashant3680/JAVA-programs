import java.util.Scanner;
class SquareSum
{ public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	int sum=1;

	if(num<=0)
	{System.out.println(num+" is not a natural number");
	 return;
	}

	for(int i=2;i<=num;i++)
	{
	  sum+=i*i;	
	}
	System.out.println("The sum of squares of natural numbers till "+num+" is: "+sum); 
 }
}