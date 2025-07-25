import java.util.Scanner;
import java.util.InputMismatchException;
public class FinallyExp 
{
	public static void main(String[] a)
	{
		try
		{	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numerator: ");
			int num=sc.nextInt();
			System.out.println("Enter the denominator: ");
			int den=sc.nextInt();
			System.out.println(num/den);
		    return;
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont divide by zero!");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please eneter correct input!");
		}
		catch(NullPointerException e)
		{
			System.out.println("Dont call the memeber using null as a reference!");
		}
		finally
		{
			System.out.println("Finally block executed!");
		}
		System.out.println("Desired destination reached!");
		
	}
}