import java.util.Scanner;
class FibonacciSeries
{ public static void main(String[] args)
 {
 	Scanner sc=new Scanner(System.in);
 	System.out.print("Enter the number:");
 	int n=sc.nextInt();

 	int n1=0,n2=1,n3;
 	int i=0;
 	while(i<n)
 	{
 	 n3=n1+n2;
 	 System.out.println(n1);
 	 n1=n2;
 	 n2=n3;
 	 i++;
 	}

 }	
}