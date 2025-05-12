import java.util.Scanner;
class BinaryToDecimal
{public static void main(String[] args)
 {
 	System.out.print("Enter a binary number: ");
	int bin=new Scanner(System.in).nextInt();
	int temp=bin;
	int count=0;
	int rev=0;
	int num=0;

	while(temp>0)
	{
	 if(temp%10!=0 && temp%10!=1)
	 {
	  System.out.println("Binary number contains only 1 and 0");
	  return;
	 }
	 temp/=10;
	}

	while(bin>0)
	{
	 rev=rev*10+ bin%10;
	 count++;
	 bin/=10;
	}	

	while(count>0)
	{
	 num=num*2 + rev%10;
	 count--;
	 rev/=10;
	}
	

	System.out.println("Number: "+num);

	
 }
}