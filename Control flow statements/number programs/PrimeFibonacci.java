import java.util.Scanner;
class PrimeFibonacci
{ 
 public static void main(String[] args)
 {
 	 Scanner sc=new Scanner(System.in);
 	 System.out.print("Enter the number:");
 	 int n=sc.nextInt();
 	 int temp=n;
 	 int n1=0,n2=1,n3=0;

 	 while(n3<n)
 	 {
 	  n3=n1+n2;
 	  n1=n2;
 	  n2=n3;
 	 }

 	 if(n3==n)
 	 { for(int i=2;i<=n/2;i++)
 	   {
 	   	if(n%i==0)
        {System.out.println(temp+" is a fibonacci but not a prime number");
        return;
        }
 	   }
 	  	System.out.println(temp+" is a fibonacci and a prime number");
 	 }	
 	 
 	 else
 	{
 	 for(int i=2;i<=n/2;i++)
 	   {
 	   	if(n%i==0)
        {System.out.println(temp+" is a not a fibonacci and prime number");
        return;
        }
 	   }
 	  	System.out.println(temp+" is not a fibonacci but a prime number");	
 	}



 }
}