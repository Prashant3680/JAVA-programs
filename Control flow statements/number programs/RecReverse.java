import java.util.Scanner;
class RecReverse
{
 public static void main(String[] a)
 {
	System.out.print("Enter a number:");
	int num=new Scanner(System.in).nextInt();
	System.out.println(reverse(num,0));
 }

 public static int reverse(int num,int rev)
 {
	if(num==0)
	return rev;
	
	rev=rev*10+num%10;
	return reverse(num/10,rev);
 }

}