import java.util.Scanner;
class RecFactors
{
 public static void main(String[] a)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	factors(num,2);
 }

 public static void factors(int num,int div)
 {
	if(div<=num)
 	{
	  if(num%div==0)
	  {System.out.println(div);
	   num/=div;
	  }
	  else
	   div++;

	 factors(num,div);
	}

	return;

 }
}