import java.util.Scanner;
class NumberSquare6
{ public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int n=new Scanner(System.in).nextInt();
	char ch='a';

	for(int i=1;i<=n;i++)
	{
	  for(int j=1;j<=n;j++)
	  {
		if(i==j || i+j==n+1)
		System.out.print(ch + " ");
		else
		System.out.print(j+" ");
	  }
	ch++;
	System.out.println();
	}
 }
}