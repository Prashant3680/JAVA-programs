import java.util.Scanner;
class Switch1
{ public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);

	System.out.print("Enter the month in upper case:");
	String s=sc.next();

	
	switch(s)
	{ 
	 case "JANUARY":
	{System.out.println("Crops:Spinach,cabbage,carrots,radish");
	break;
	}

	case "FEBRUARY" :
	{ System.out.println("Crops:Pees,tomato,carrot");
	break;
	}

	case "MARCH" :
	{ System.out.println("Crops:tomato,cucmber,okra,bottle gourd");
	break;
	}

	case "APRIL" :
	{ System.out.println("Crops: okra,tomato,chillies,brinjals,beans");
	break;
	}

	case "MAY" :
	{ System.out.println("crops:brinjal,tomato,okra");
	break;
	}

	case "JUNE" :
	{ System.out.println("crops:pumpkin,onion,capsicum,gourd");
	break;
	}

	case "JULY" :
	{ System.out.println("crops:amarnath,cowpea,squashes,brocolli");
	break;
	}

	case "AUGUST" :
	{ System.out.println("crops:beetroot,cowpea,pumpkin,chilli");
	break;
	}

	case "SEPTEMBER" :
	{ System.out.println("crops:cauliflower,peas,radish");
	break;
	}

	case "OCTOBER" :
	{ System.out.println("crops:spinach,beetroot,peas");
	break;
	}

	case "NOVEMBER" :
	{ System.out.println("crops:fenugreek,cabbage,peas,cauliflower");
	break;
	}

	case "DECEMBER" :
	{ System.out.println("crops:carrots,beetroot,radish");
	break;
	}

	
	default:
	{ System.out.println("Enter the correct month in uppper case");
	}
	}

 }

}