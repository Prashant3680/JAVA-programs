import java.util.Scanner;
class StrongNumber
{ public static void main(String[] args)
 {	
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	int temp=num,sum=0;

	if(num<0)
	{System.out.println("Factorial of negative number is not possible");
	return;
	}

	for(  ; temp>0 ; temp/=10)
	{ int fact=1;
	  for(int i=1 ; i<=temp%10 ; i++)
	  {
	  fact*=i;	 
	  }
	  sum+=fact;
	}

	if(sum==num && num!=0)
	System.out.println(num+" is a Strong number");
	else
	System.out.println(num+" is not a strong number");
 }
}