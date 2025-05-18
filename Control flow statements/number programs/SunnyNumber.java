import java.util.Scanner;
class SunnyNumber
{ public static void main(String[] args)
 {
	int num ;

	for(;;)
	{	
	System.out.print("Enter a number: ");
	num=new Scanner(System.in).nextInt();

	if(num<0)
	{ System.out.println("Negative number cannot be a perfect square, Please enter a positive number!");
	  continue;
	}
	break;
	}
	
	for(int i=0;i<=num;i++)
	{
	 if(i*i==num+1)
	 {
	  System.out.println(num+" is a Sunny number");
	  break;
	 }
	
	 else if(i*i>=num)
	 {System.out.println(num+" is not a Sunny number");
	 break;
	 }
	}
 }
}