import java.util.Scanner;
import java.util.InputMismatchException;
public class Exp1 
{
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator: ");
		int num=sc.nextInt();
		System.out.println("Enter the denominator: ");
		int den=sc.nextInt();
		
		
		int ans=num/den;
		System.out.println(ans);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Don't divide the number by zero!");
		}
		catch(NullPointerException e)
		{
			System.out.println("Dont call the member using null as a reference!");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter the correct input as per requirement!");
		}
		
		System.out.println("Program ends!");
		
	}
}
