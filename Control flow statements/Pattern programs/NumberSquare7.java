import java.util.Scanner;
class NumberSquare7
{ public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int n=new Scanner(System.in).nextInt();
	char ch='a';
	int count=1;

	for(int i=1;i<=n;i++)
	{
	  for(int j=1;j<=n;j++)
	  {
		if(j%2==0)
		{System.out.print(ch + " ");
		 ch+=4;
		}
		else
		{System.out.print(count+" ");
		 count+=4;
		}
	  }
	ch-=7;
	count-=7;
	System.out.println();
	}
 }
}