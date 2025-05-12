import java.util.Scanner;
class CheckFibonacci
{ 
 public static void main(String[] args)
 {
 	 Scanner sc=new Scanner(System.in);
 	 System.out.print("Enter the number:");
 	 int n=sc.nextInt();
 	 int n1=0,n2=1,n3=0;

 	 while(n3<n)
 	 {
 	  n3=n1+n2;
 	  n1=n2;
 	  n2=n3;
 	 }

 	 if(n3==n)
 	 System.out.println(n+" is a fibonacci number");
 	 else
 	 System.out.println(n+" is not a fibonacci number");



 }
}