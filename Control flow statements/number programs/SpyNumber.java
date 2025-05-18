import java.util.Scanner;
class SpyNumber
{ public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter a number:");
	 int num=sc.nextInt();
	 int temp=num,sum=0,prod=1;

	 while(temp!=0)
	{
		sum+=temp%10;
		prod*=temp%10;
		temp/=10;
	}

	if(sum==prod)
	System.out.println(num+" is a Spy number");
	else
	System.out.println(num+" is not a spy number");
	 
	 
 }
}