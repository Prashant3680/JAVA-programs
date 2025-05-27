import java.util.Scanner;
class NumberSquare5
{ public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	char ch=97;
	int count=1;

	for(int i=1; i<=num ;i++)
	{
	 for(int j=1 ; j<=num; j++)
	 {
	 System.out.print(i%2==0?ch++ +"  ":(count<10?count++ +"  ":count++ +" "));
	 }
	System.out.println();

	}
 }
}