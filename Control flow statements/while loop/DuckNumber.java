import java.util.Scanner;
class DuckNumber
{ public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	int num=sc.nextInt();
	int count=0;
 	while(num>0)
	{ int rem=num%10;
	if(rem==0)
	{count++;
	}
	num/=10;
	}
	if(count>0)
	System.out.println("Entered number is Duck number");
	else
	System.out.println("Entered number is non duck number");



 }
}