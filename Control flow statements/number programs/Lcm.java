import java.util.Scanner;
class Lcm
{
 public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the first number:");
	 int n1=sc.nextInt();
	 System.out.print("Enter the second number:");
	 int n2=sc.nextInt();
	 int large=n1>n2?n1:n2;

	 int i=1;
	 while(true)
	 {
	  if((large*i)%n1==0 && (large*i)%n2==0)
	  {
	   System.out.print("LCM of "+n1+" and "+n2+" is "+(large*i));
	   break;
	  }
	  i++;
	 }
	}
}