import java.util.Scanner;
class TechNumber
{ public static void main(String[] args)
 {
	int num,temp,divisor=1,sum,count;

	for(;;)
	{ count=0;
	System.out.print("Enter a number:");
	num=new Scanner(System.in).nextInt();
	temp=num;
	
	while(temp>0)
	{ temp/=10;
	 count++;
	}

	if(count%2==1)
	{
	  System.out.println("Please enter a number with even number of digits");
	  continue;
	}
	break;
	}

	for(int i=1;i<=count/2;i++)
	divisor*=10;

	sum=num/divisor + num%divisor;

	if(sum*sum==num)
	System.out.println(num+" is a tech number");
	else
	System.out.println(num+" is not a tech number");
 }
}