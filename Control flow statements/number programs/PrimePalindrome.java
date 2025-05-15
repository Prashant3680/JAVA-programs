import java.util.Scanner;
class PrimePalindrome
{ public static void main(String[] args)
 {
 	Scanner sc=new Scanner(System.in);
 	System.out.print("Enter the number:");
 	int n=sc.nextInt();
 	int temp=n;

 	for(int i=2;i<=n/2;i++)
 	{
 		if(n%i==0)
 		{
 		 System.out.println(n+" is not a prime number");
 		 return;
 		}

 	}


 	int rev=0;
 	while(n>0)
 	{
 	 int d=n%10;
 	 rev=rev*10+d;
 	 n/=10;
 	}

 	if(rev==temp)
 	{
 	 System.out.print(temp+" is a prime number and a Palindrome");
 	}
 	else
 	{
 	 System.out.print(temp+" is a prime but not a palindrome");
 	}
 }
	
}