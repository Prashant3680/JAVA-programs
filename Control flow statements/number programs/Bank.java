import java.util.*;
class Bank
{ 
	static String name;
	static String email;
	static String address;
	static double bal;
	static int pin;
	static String contact;
	static long aadhar;
	static String panNumber;
	static long accountNumber=1234_1234_1234l;
	static String ifsc="LCF0009211";
	static ArrayList<String> statement=new ArrayList<String>();
	
     public static void main(String[] args)
	{
		for( ; ; )
		{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("-----------WELCOME--------------");
		System.out.println("     ||Laxmi Chit Fund||");
		System.out.println();
		System.out.println();
		System.out.println(" 1.Signup ");
		System.out.println(" 2.Signin ");
		System.out.println();
		System.out.print(" Enter your option:");

		switch(sc.nextInt())
		{
		 case 1:
		 {
		   System.out.print("    CREATE ACCOUNT");
		   System.out.println();
		   System.out.print("Name: ");
		   name=new Scanner(System.in).nextLine();
		   System.out.print("Email: ");
		   email=new Scanner(System.in).nextLine();
		   System.out.print("Address: ");
		   address=new Scanner(System.in).nextLine();
		   System.out.print("Aadhar number: ");
		   aadhar=sc.nextLong();
		   System.out.print("Pan number: ");
		   panNumber=new Scanner(System.in).nextLine();
		   System.out.print("Contact number: ");
		   contact=sc.next();
		   System.out.print("Password: ");
		   pin=sc.nextInt();
		   System.out.print("Enter a deposit amount: ");
		   bal=sc.nextDouble();
		   statement.add("Deposit:"+bal+" Rs (Account creation)");
		   System.out.println();
		   System.out.println("Account created successfully!");
		   
		 }

		case 2:
			{
			 for(int attempts=3;attempts>0; attempts--)
			 {
			 System.out.println("       LOG IN");
			 System.out.println();
			 System.out.print("Username/phone no:");
			 String nameip=new Scanner(System.in).nextLine();
			 System.out.println("Password: ");
			 long pinip=sc.nextInt();

			 if( (nameip.equals(name) || nameip.equals(contact)) && pinip==pin )
			 	{
			 		System.out.println("   LOGIN SUCCESSFULL!!");
			 		System.out.println();
			 		homePage:
			 		for( ; ; )
			 		{
			 		 System.out.println();
			 		 System.out.println("----------HOME PAGE---------");
			 		 System.out.println();
			 		 System.out.println("1.Deposit Amount");
			 		 System.out.println("2.Withdraw amount");
			 		 System.out.println("3.Check balance");
			 		 System.out.println("4.Statement");
			 		 System.out.println("5.Loan");
			 		 System.out.println("6.Profile");
			 		 System.out.println("7.Logout");
			 		 System.out.println();
			 		 System.out.println("Enter the option: ");

			 		 switch(sc.nextInt())
			 		 {
			 		 case 1:
			 		 	{System.out.println();
			 		 	 System.out.println("           DEPOSIT MODULE");
			 		 	 System.out.println();
			 		 	 System.out.println("Enter the amount to be deposited: ");
			 		 	 double depAmt=sc.nextDouble();
			 		 	 bal+=depAmt;
			 		 	 System.out.println("Amount deposited successfully!");
			 		 	 statement.add("Credited : "+depAmt);
			 		 	 break;
			 		 	}

			 		  case 2:
			 		 	{System.out.println();
			 		 	 System.out.println("            WITHDRAW MODULE");
			 		 	 System.out.println("Enter the withdraw amount:");
			 		 	 double withAmt=sc.nextDouble();
			 		 	 
			 		 	 
			 		 	  System.out.println("Enter the pin: ");
			 		 	  int pin1=sc.nextInt();

			 		 	  if(pin1==pin)
			 		 	  {
			 		 	  	if(withAmt<=bal)
			 		 	  	{
			 		 	  		System.out.println("Withdrawal of Rs."+withAmt+" successful");
			 		 	  		bal-=withAmt;
			 		 	  		System.out.println("Remaining balance: "+bal);
			 		 	  		statement.add("Debited: "+withAmt);
			 		 	  	}
			 		 	  	else 
			 		 	  	 {
			 		 	  	 	System.out.println("Insufficient funds!");
			 		 	  	 }
			 		 	  }
			 		 	  else 
			 		 	  {
			 		 	  	System.out.println("Incorrect pin");
			 		 	  	
			 		 	  }
			 		 	 break;
			 		 	}

			 		  case 3:
			 		 	{
			 		 	 System.out.println();
			 		     System.out.println("          CHECK BALANCE");
			 		 	 System.out.println("Balance: "+bal+" Rs");

			 		 	 break;
			 		 	}

			 		  

			 		  case 4:
			 		 	{System.out.println();
			 		 	 System.out.println("            STATEMENT");
			 		 	 for(String st:statement)
			 		 	  {
			 		 	  	System.out.println(st);
			 		 	  }
			 		 	 break;
			 		 	}

			 		 case 5:
			 		 	{System.out.println();
			 		 	 System.out.println("                  LOAN MODULE");
			 		 	 break;
			 		 	}

			 		  case 6:
			 		 	{System.out.println();
			 		 	 System.out.println("         PROFILE");
			 		 	 System.out.println("Name: "+name);
			 		 	 System.out.println("Account number: "+accountNumber);
			 		 	 System.out.println("IFSC code: "+ifsc);
			 		 	 System.out.println("Contact no: "+contact);
			 		 	 System.out.println("Email id: "+email);
			 		 	 System.out.println("Aadhar no: "+aadhar);
			 		 	 System.out.println("PAN card no: "+panNumber);
			 		 	 System.out.println("Address: "+address);
			 		 	 System.out.println();
			 		 	 System.out.println("Edit?");
			 		 	 System.out.println("1.Yes");
			 		 	 System.out.println("2.No");
			 		 	 if(sc.nextInt()==1)
			 		 	 {
			 		 	 	System.out.println();
			 		 	 	System.out.println("EDIT MODULE");
			 		 	 	System.out.println("1.Name");
			 		 	 	System.out.println("2.Contact no");
			 		 	 	System.out.println("3.Email id");
			 		 	 	System.out.println("4.Aadhar no");
			 		 	 	System.out.println("5.PAN no");
			 		 	 	System.out.println("6.Address");
			 		 	 	System.out.println("7.Password");
			 		 	 	System.out.println();
			 		 	 	System.out.println("Enter your option");
			 		 	 	switch(sc.nextInt())
			 		 	 	{
			 		 	 	case 1:
			 		 	 		System.out.println("Name: ");
			 		 	 		name=new Scanner(System.in).nextLine();
			 		 	 		break;

			 		 	 	case 2:
			 		 	 	    System.out.println("Contact no: ");
			 		 	 	    contact=sc.next();
			 		 	 	    break;

			 		 	 	case 3:
			 		 	 		System.out.println("Email id: ");
			 		 	 		email=new Scanner(System.in).nextLine();
			 		 	 		break;

			 		 	 	case 4:
			 		 	 		System.out.println("Aadhar no: ");
			 		 	 		aadhar=sc.nextInt();
			 		 	 		break;

			 		 	 	case 5:
			 		 	 		System.out.println("PAN NO: ");
			 		 	 		panNumber=new Scanner(System.in).nextLine();
			 		 	 		break;

			 		 	 	case 6:
			 		 	 		System.out.println("Address: ");
			 		 	 		address=new Scanner(System.in).nextLine();
			 		 	 		break;

			 		 	 	case 7:
			 		 	 		System.out.println("New pin");
			 		 	 		pin=sc.nextInt();
			 		 	 		break;

			 		 	 	default:
			 		 	 		System.out.println("Enter correct option!");



			 		 	 	}
			 		 	 	System.out.println("PROFILE EDITED SUCCESSFULLY!");
			 		 	 }
			 		 	 break;
			 		 	}

			 		  case 7:
			 		 	{System.out.println("Thank You, Visit again!");
			 		 	 return;
			 		 	}

			 		  default:
			 		 	{System.out.println("Incorrect option entered");
			 		 	 break;
			 		 	}


			 		 }

			 		}

			 	}
			 else 
			 {
			 	System.out.println("Incorrect Username/password:");
			 	System.out.println("Attempts left: "+(attempts-1));

			 }

			}
			System.out.println("Account deactivated for 48 hours");
			System.exit(0);

			}

		default:
			System.out.println("Enter correct option");


		}


        }
	}
}