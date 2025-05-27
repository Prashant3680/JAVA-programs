import java.util.Scanner;
class NumberSquare8
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
		System.out.print(count+" ");
		if(count<10)
		System.out.print(" ");
		count+=4;
		
	  }
	count-=15;
	System.out.println();
	}
 }
}