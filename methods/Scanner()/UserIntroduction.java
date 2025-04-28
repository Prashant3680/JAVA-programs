import java.util.Scanner;
class UserIntroduction
{ public static void main(String[] args)
 {
	Scanner c=new Scanner(System.in);
	System.out.print("Enter your first name:");
	String s1=c.next();
	
	System.out.print("Enter your second name:");
	String s2=c.next();

	System.out.print("Enter your last name:");
	String s3=c.next();

	System.out.print("Enter your email id:");
	String s4=c.next();

	System.out.print("Enter your Mobile number:");
	long l1= c.nextLong();

	System.out.print("Enter your YOP:");
	int i1=c.nextInt();

	System.out.print("Enter your degree:");
	String s5=c.next();

	System.out.print("Enter your Stream:");
	String s6=c.next();

	System.out.println(" ");
	System.out.println("Full Name:"+s1+" "+s2+" "+s3);
	System.out.println("Email id:"+s4);
	System.out.println("Mobile Number:"+l1);
	System.out.println("YOP"+i1);
	System.out.println("Degree"+s5);
	System.out.println("Stream"+s6);
	
 }
}