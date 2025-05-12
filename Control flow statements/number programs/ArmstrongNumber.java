import java.util.Scanner;
class ArmstrongNumber
{ public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	int count=0,temp=num,prod=1,sum=0;
	
	while(temp!=0)
	{
 	 temp/=10;
	 count++;
	}

	temp=num;

	while(temp!=0)
	{
	 int lastDigit=temp%10;
	 prod=1;
	 for(int i=1;i<=count;i++)
	 {
		prod*=lastDigit;
	 } 
	 sum+=prod;
	 temp/=10;
	}

	if(sum==num)
	System.out.println(num+" is an Armstrong number");
	else
	System.out.println(num+" is not an Armstrong number");

 }
}