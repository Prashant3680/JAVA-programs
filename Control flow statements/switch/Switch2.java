import java.util.Scanner;
class Switch2
{ public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter the month in upper case:");
	String s=sc.next();

	
	switch(s)
	{ 
	
	 case "MARCH" :
	 case "APRIL" :
	 case "MAY" :
 	 case "JUNE" :
	{ System.out.println("It is summer");
	break;
	}

	case "JULY" :
	 case "AUGUST" :
	case "SEPTEMBER":
	case "OCTOBER" :
	{ System.out.println("It is monsoon");
	break;
	}

	case "JANUARY" :
	case "FEBRUARY" :
	case "NOVEMBER" :
	case "DECEMBER" :
	{ System.out.println("It is winter");
	break;
	}

	
	default:
	{ System.out.println("Enter the correct month in uppper case");
	}
	}

 }

}