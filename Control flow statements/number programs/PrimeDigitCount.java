import java.util.Scanner;
class PrimeDigitCount
{ public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int count=0;
		int temp=n;

		while(temp>0)
		{ int den=2;
	     
		 for( ; den<(temp%10); den++ )
		 {
		 	if((temp%10)%den==0)
		 	{
		 		break;
		 	}
		 	
		 }
		 if(den==(temp%10))
		 {
		 	count++;
		 }

		 temp/=10;

		}
		System.out.println("Count of prime digits in "+n+" is "+count);

	}
}