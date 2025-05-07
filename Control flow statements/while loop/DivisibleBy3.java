import java.util.Scanner;
class DivisibleBy3
{ public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	int num=sc.nextInt();
	int count=0;
 	while(num>0)
	{ int rem=num%10;
	if(rem%3==0)
	{count++;
	}
	num/=10;
	}
	
	System.out.println("Digits divisible by 3:"+count);
	

 }
}