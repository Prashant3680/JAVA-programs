import java.util.Scanner;
class BinaryConverter
{ public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	String bin="" ;
	
	if(num<0)
	num*=-1;

	for( ;num>0;num/=2)
	{
	  bin=num%2+ bin;
	}

	System.out.println("Binary value: "+bin);
 }
}