import java.util.Scanner;
class Scanner1
{ public static void main(String[] args)
 {
	Scanner a=new Scanner(System.in);
	System.out.print("Enter value <127:");
	byte b1=a.nextByte();
	
	System.out.print("Enter value <127:");
	byte b2=a.nextByte();

	System.out.print("Enter char value:");
	char c=a.next().charAt(0);

	System.out.print("Enter value <32767:");
	Short s=a.nextShort();

	System.out.print("Enter int value:");
	int i=a.nextInt();

	System.out.print("Enter long value:");
	long l= a.nextLong();

	System.out.print("Enter float value:");
	float f=a.nextFloat();

	System.out.print("Enter your Stream:");
	double d=a.nextDouble();

	System.out.print("Enter boolean value:");
	boolean bl= a.nextBoolean();

	System.out.print("Enter a string:");
	String s1= a.next();



	System.out.println(" ");
	System.out.println("byte:"+b1);
	System.out.println("byte:"+b2);
	System.out.println("char:"+c);
	System.out.println("short:"+s);
	System.out.println("int:"+i);
	System.out.println("long:"+l);
	System.out.println("Double:"+d);
	System.out.println("boolean:"+bl);
	System.out.println("string:"+s1);

	
 }
}