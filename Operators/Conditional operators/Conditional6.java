import java.util.Scanner;
class Conditional6
{ public static void main(String[] args)
 { Scanner sc=new Scanner(System.in);
	System.out.print("Enter a character:");
	char c=sc.next().charAt(0);
	String s;
	if(c>=65 && c<=90 || c>=97 && c<=122)
	{ s=(c>=65 && c<=90)?(c+" is an upper case character"):(c+" is a lower case character");
	}
	else
	{s="Please enter an alphabet";
	}
	System.out.println(s);
 }
}