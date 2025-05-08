import java.util.Scanner;
class DigitExtractor
{ public static void main(String[] args)
 { Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	int num=sc.nextInt();
	
	for( ; num>0; )
	{ int rem=num%10;
	System.out.println(rem);

	num=num/10;
	}
	




}
}