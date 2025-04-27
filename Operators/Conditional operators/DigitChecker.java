import java.util.Scanner;
class DigitChecker
{
 public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a character:");
	char c=sc.next().charAt(0);

	String s=(c>=48 && c<=57)?(c+" is a digit"):(c+" is not a digit");
	System.out.println(s);
 }
}