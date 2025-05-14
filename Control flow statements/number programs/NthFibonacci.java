import java.util.Scanner;
class NthFibonacci
{ public static void main(String[] args)
 {
 	Scanner sc=new Scanner(System.in);
 	System.out.print("Enter the number:");
 	int n=sc.nextInt();
 	int n1=0,n2=1,n3;

 	for(int count=1; ;count++)
 	{
 	 n3=n1+n2;
 	 if(count==n)
 	 {
 	 	System.out.println("The "+n+"th fibonacci numbers is "+n1);
 	 	break;
 	 }
 	 n1=n2;
 	 n2=n3;

 	}
 	

 }	
}