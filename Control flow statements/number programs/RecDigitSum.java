import java.util.Scanner;
class RecDigitSum
{
 public static void main(String[] a)
 {
	System.out.print("Enter a number:");
	int num=new Scanner(System.in).nextInt();
	System.out.println(digitSum(num));
 }

 public static int digitSum(int num)
 {
	if(num==0)
	return 0;

	return num%10 + digitSum(num/10);
 }

}