import java.util.Scanner;
class Switch
{ public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter the 1st digit:");
	float f1=sc.nextFloat();

	System.out.print("Enter the 2nd digit:");
	float f2=sc.nextFloat();

	System.out.print("Enter the mathematical operation:");
	char c=sc.next().charAt(0);

	switch(c)
	{ 
	 case '+':
	{System.out.println("Ans="+(f1+f2));
	break;
	}

	case '-' :
	{ System.out.println("Ans="+(f1-f2));
	break;
	}

	case '*' :
	{ System.out.println("Ans="+(f1*f2));
	break;
	}

	case '/' :
	{ System.out.println("Ans="+(f1/f2));
	break;
	}

	case '%' :
	{ System.out.println("Ans="+(f1%f2));
	break;
	}
	
	default:
	{ System.out.println("Enter the correct mathematical operator");
	}
	}

 }

}