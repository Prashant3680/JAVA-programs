import java.util.Scanner;
class PalindromeInRange
{ public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the first number:");
	  int n1=sc.nextInt();

	  System.out.print("Enter the Second number:");
	  int n2=sc.nextInt();

	  int small=n1<n2?n1:n2;
	  int large=n1>n2?n1:n2;

	  while(small<=large)
	  { int temp=small;
	    int rev=0;
	  	while(temp>0)
	  	{
	  	 rev=rev*10+(temp%10);
	  	 temp/=10;
	  	}
	  	
	  	if(rev==small)
	  	{
	  	 System.out.println(small);
	  	}
	  	small++;

	  }

	  


	}
}
