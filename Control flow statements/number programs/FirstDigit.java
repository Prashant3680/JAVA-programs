import java.util.Scanner;
class FirstDigit
{ public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	int temp=num;
	int digit=0;
	while(temp!=0)
	{
		digit=temp%10;
		temp/=10;
	}
	if(digit%2==0)
	System.out.println("The first digit of "+ num+" is even");
	else
	System.out.println("The first digit of "+num+" is odd"); 
 }
}