import java.util.Scanner;
class SearchingDigit
{ public static void main(String[] args)
 {
 	Scanner sc=new Scanner(System.in);
 	System.out.print("Enter the number:");
 	int n=sc.nextInt();
 	int temp=n;
 	System.out.print("Enter the digit:");
 	int d=sc.nextInt();

 
 	 for( ;n>0;n/=10)
     {
     	int rem=n%10;
     	if(rem==d)
     	{
     	System.out.print(temp+" contains the digit "+d);
     	return;
     	}

     }
     System.out.println(temp+" doesn't contain the digit "+d);
 }	
}