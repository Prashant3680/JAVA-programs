import java.util.Scanner;
class AutomorphicNumber
{ public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	int count=0,temp=num,divisor=1;

	while(temp>0)
	{ temp/=10;
	 count++;
	}

	for(int i=1;i<=count;i++)	
	divisor*=10;

	if(num*num%divisor==num)
	System.out.println(num+" is an Automorphic number");
	else
	System.out.println(num+" is not an Automorphic number");

 }
}