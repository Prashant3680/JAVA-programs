import java.util.Scanner;
class HappyNumber
{
 public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	int temp=num;

	while(temp>9)
	{
	  int sum=0;
	  while(temp>0)
	  {sum+=(temp%10)*(temp%10);
	   temp/=10;
	  }
	 temp=sum;
	}

	if(temp==1)
	System.out.println(num+" is a Happy number");
	else
	System.out.println(num+" is not a happy number");
	
 }
}