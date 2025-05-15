import java.util.Scanner;
class PrimeTill
{ public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();

		
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
        System.out.println(i1);
		}
	}
}