import java.util.Scanner;
class Factorial
{ public static void main(String[] args)
 {
 	Scanner sc=new Scanner(System.in);
 	System.out.print("Enter a number:");
 	int n=sc.nextInt();
 	int ans=1;

 	for( ;n>0;)
 	{
 		ans=ans*n;
 		n--;
 	}

 	System.out.println("Ans: "+ans);




 }	
}