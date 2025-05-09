import java.util.Scanner;
class LoanCalculator
{ 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		 for( ; ; )
		{
			System.out.println("--------LOAN CALCULATOR---------");
			System.out.println();
			System.out.println("1.Home loan");
			System.out.println("2.Gold loan");
			System.out.println("3.Vehicle loan");
			System.out.println("4.Educational loan");
			System.out.println("5.Personal loan");
			System.out.println("6.Business loan");
			System.out.println();
			int roi;
			int interest;
			System.out.println("Choose your loan type:");

			int op=sc.nextInt();
			switch(op)
			{
			case 1:
				System.out.println("Home loan");
				roi=6.5;
				System.out.println("ROI:"+roi);
				break;

			case 2:
				System.out.println("Gold loan");
				roi=7;
				System.out.println("ROI:"+roi);
				break;

			case 3:
				System.out.println("Vehicle loan");
				roi=8.5;
				System.out.println("ROI:"+roi);
				break;

			case 4:
				System.out.println("Educational loan");
				roi=8;
				System.out.println("ROI:"+roi);
				break;

			case 5:
				System.out.println("Personal loan");
				roi=12;
				System.out.println("ROI:"+roi);
				break;

			case 6:
				System.out.println("Business loan");
				roi=16;
				System.out.println("ROI:"+roi);
				break;
			
			default:
				System.out.println("Enter the correct option!");
				continue;
			}
		for( ; ; )
		{
			System.out.println("Enter the amount:");
			double amt=sc.nextDouble();

		if(amt<1000 || amt>5000000)
		{
		 System.out.println("Please eneter the amount in the range Rs. 1000 - 5000000");
		 continue;
		}

		System.out.println("Enter the tenure: ");
		float tenure=sc.nextFloat();

		if(tenure<1 || tenure >20)
		{
			System.out.println("Please enter the tenure in the range 1-20 years");
			continue;
		}

		interest=(amt*roi*tenure)/100;
		System.out.println("Interest: "+interest);
		System.out.println("Principal amount: "+(amt+interest));
		System.out.println("EMI :"+(amt+interest)/(tenure*12));
		System.exit(0);

		 }


		}
		
	}
}