import java.util.Scanner;
class If1
{ public static void main(String[] args)
 { 
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your age:");
	int age=sc.nextInt();
	int amt=100;

	if(age<10)	
	{
	 amt/=2;
	System.out.println("Half ticket considered!");
	}

	System.out.println("The ticket price is:"+amt);

 }

}