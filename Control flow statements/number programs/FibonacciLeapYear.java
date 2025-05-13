import java.util.Scanner;
class FibonacciLeapYear
{ public static void main(String[] args)
 { 
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the year: ");
  int n=sc.nextInt();
   if((n%4==0 && n%100!=0)|| n%400==0)
   {
     int n1=0,n2=1,n3;
     while(n1<n)
     {
       n3=n1+n2;
       n1=n2;
       n2=n3;
     }
     if(n1==n)
     {
      System.out.println(n+" is a fibonacci leap year");
     }
     else
     {
       System.out.println(n+" is a leap year but not a fibonacci year");
     }
   }
   else
   System.out.println(n+" is not a leap year");

 }	
}