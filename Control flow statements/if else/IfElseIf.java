import java.util.Scanner;
class IfElseIf
{public static void main(String[] args)
 { Scanner sc=new Scanner(System.in);

	System.out.println("Enter a character:");
	char c=sc.next().charAt(0);

	if(c>='A' && c<='Z')
	{
	 System.out.println("Upper case character");
	}

	else if(c>='a' && c<='z')
	{
	System.out.println("Lower case character");
	}

	else if(c>='0' && c<='9')
	{ System.out.println("It is a digit");
	}

	else
	{ System.out.println("Special character");
	}
	



 }

}