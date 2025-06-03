import java.util.Scanner;
class RecPalindrome
{
 public static void main(String[] a)
 {
	System.out.print("Enter a number:");
	int num=new Scanner(System.in).nextInt();
	System.out.println(isPalindrome(num)?num+" is a palindrome":num+" is not a palindrome");
 }

 public static boolean isPalindrome(int num)
 {
	return reverse(num,0)==num;
 }

 public static int reverse(int num,int rev)
 {
	if(num==0)
	return rev;
	
	rev=rev*10+num%10;
	return reverse(num/10,rev);
 }

}