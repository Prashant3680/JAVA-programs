import java.util.Scanner;
class Eligibility
{ public static void main(String[] args)
 { 
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your branch in upper case:");
	String s=sc.next();

	if(s=="CS"||s=="IT"||s=="EC")	
	{
	System.out.println("You are eligible for Java Developer role and software testing role.");
	}
	else
	{
	System.out.println("You are eligible for Software testing role.");
	}
 }

}