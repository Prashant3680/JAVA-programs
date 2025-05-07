import java.util.Scanner;
class EvenOddCounter
{ public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	int num=sc.nextInt();
	int ecount=0,ocount=0;
 	while(num>0)
	{ int rem=num%10;
	if(rem%2==0)
	{ecount++;
	}
	else
	{ocount++;
	}
	num/=10;
	}

	System.out.println("Even count: "+ecount);
	System.out.println("Odd count:" +ocount);



 }
}