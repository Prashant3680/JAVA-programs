import java.util.Scanner;
class Factors
{
  public static void main(String[] args)
 {
 	Scanner sc=new Scanner(System.in);
 	System.out.print("Enter the number:");
 	int n=sc.nextInt();
 	System.out.println("Fcators of "+n+" are:");
 	int i=1;
 	
 	while(i<=n/2)
 	{
 	 if(n%i==0)
 	 System.out.println(i);
 	 i++;
 	}

 	System.out.print(n);

 }	
}