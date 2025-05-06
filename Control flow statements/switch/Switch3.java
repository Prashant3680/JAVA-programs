import java.util.Scanner;
class Switch3
{ public static void main(String[] args)
 {
	Scanner sc= new Scanner(System.in);
	System.out.println("1.MUMBAI");
	System.out.println("2.PUNE");
	System.out.println("3.KOLHAPUR");
	System.out.println("4.NASHIK");
	System.out.println("5.KOKAN");
	System.out.println("Select a city:");
	int a=sc.nextInt();

	switch (a)
	{
	case 1:
	{System.out.println("Tourist places: 1.Gateway of India");
	 System.out.println("                2.Marine Drive");
	System.out.println("                 3.CSMT");
	System.out.println("                 4.Bandra worli sea link");
	System.out.println("                 5.Juhu beach");
	System.out.println("                 6.Siddhivinayak temple");
	break;
	}

	case 2:
	{System.out.println("Tourist places: 1.Shanivar wada");
	System.out.println("                 2.Sinhagad");
	System.out.println("                 3.Dagdusheth mandir");
	System.out.println("                 4.Tamhini ghat");
	System.out.println("                 5.Shivneri fort");
	break;
	}

	case 3:
	{System.out.println("Tourist places: 1.Mahalaxmi temple");
	System.out.println("                 2.Panhala fort");
	System.out.println("                 3.Rankala lake");
	System.out.println("                 4.Radhanagari wildlife sanctuary");
	System.out.println("                 5.Gaganbawda");
	break;
	}

	case 4:
	{System.out.println("Tourist places: 1.Trimbakeshwar temple");
	System.out.println("                 2.Pandavleni caves");
	System.out.println("                 3.Panchvati");
	System.out.println("                 4.Anjaneri hills"); 
	System.out.println("                 5.Dudhsagar falls");
	break;
	}

	case 5:
	System.out.println("Tourist places: 1.Malvan");
	System.out.println("                2.Ganpatipule");
	System.out.println("    	    3.Thiba palace");
	System.out.println("                4.Sindhudurg fort");
	System.out.println("		    5.Rameshwar temple");
	break;

	default:
	System.out.println("Enter value in the range 1 to 5");
					   
					   

	}



 }
}