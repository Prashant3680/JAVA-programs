import java.util.Scanner;
class RecFibonacci
{
 public static void main(String[] abc)
 {
 	System.out.print("Enter a number:");
	int num=new Scanner(System.in).nextInt();
	System.out.println(isFibonacci(0,1,num)?(num+" is a Fibonacci number"):(num+" is not a Fibonacci number"));

 }

 public static Boolean isFibonacci(int n1,int n2,int n)
 {
	if(n1==n)
	return true;
	else if(n1>n)
	return false;

	return isFibonacci(n2,n1+n2,n);

 }

}