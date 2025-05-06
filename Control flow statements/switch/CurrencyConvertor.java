import java.util.Scanner;
class CurrencyConvertor
{ public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("-----Welcome----");
	System.out.println("1. USD");
	System.out.println("2. EUR");
	System.out.println("3. GBP");
	System.out.println("4. JPY");
	System.out.println("5. BRL");
	System.out.print("Enter your response:");
	String res=sc.next().toUpperCase();

	System.out.print("Enter the amount: ");
	float amt=sc.nextFloat();
	float conv=0;

	switch(res)
	{
	case "USD" :
	{ 
	conv=amt/85.5165f;
	break;
	}

	case "EUR" :
	{ 
	conv=amt/97.6699f;
	break;
	}

	case "GBP" :
	{ 
	conv=amt/113.794f;
	break;
	}

	case "JPY" :
	{ 
	conv=amt/0.6043f;
	break;
	}

	case "BRL" :
	{ 
	conv=amt/14.7485f;
	break;
	}
	
	default:
	{ System.out.println("Invalid currency");
	return;
	}

	}

	System.out.println(amt+" INR ="+ conv+" "+ res);

	





 }
}