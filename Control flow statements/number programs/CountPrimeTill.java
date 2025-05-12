import java.util.Scanner;
class CountPrimeTill
{ public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int count=0;

		
		for(int i1=2;i1<=n;i1++)
		{ int i2=2; 
		 for( ;i2<=i1;i2++)
		 {
		  if(i1%i2==0)
		  {
		   break;
		  }

		 }
        if(i2==i1)
        count++;
		}
		System.out.println("Count of prime numbers till "+n+" is "+count);
	}
}