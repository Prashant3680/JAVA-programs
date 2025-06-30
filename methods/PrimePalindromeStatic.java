import java.util.Scanner;
class PrimePalindromeStatic
{
 static int num;

 public static void main(String[] a)
 {
	System.out.print("Enter a number:");
	num=new Scanner(System.in).nextInt();
	System.out.println(isPrime()&&isPalindrome()?num+" is a prime palindrome":num+" is not a prime palindrome");
 }	

 public static Boolean isPrime()
 {
	int i=2;
	for(;i<=num/2;i++)
	{
	  if(num%i==0)
	  return false;
	}
	return true;
 }

 public static Boolean isPalindrome()
 {
	int rev=0,temp=num;
	while(temp!=0)
	{
	  rev=rev*10+temp%10;
	  temp/=10;
	}
	
	return rev==num;
 }

}