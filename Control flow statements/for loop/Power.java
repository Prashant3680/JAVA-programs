import java.util.Scanner;
class Power
{ public static void main(String[] args)
 {
 	Scanner sc=new Scanner(System.in);
 	System.out.print("Enter the number:");
 	int n=sc.nextInt();

 	System.out.print("Enter the power:");
 	int p=sc.nextInt();

 	int ans=1;

 	for( ; p>0;p--)
 	{
 	 ans=ans*n;

 	}
 	System.out.println("Ans: "+ans);
 }	
}