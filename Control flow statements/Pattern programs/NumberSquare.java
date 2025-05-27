import java.util.Scanner;
class NumberSquare1
{ public static void main(String[] args)
 {
	System.out.print("Enter the number: ");
	int num=new Scanner(System.in).nextInt();
	
	for(int i=1; i<=num ;i++)
	{
		for(int j=1; j<=num; j++)
		System.out.print(j+" ");
		
		System.out.println();
	}
 }
}
