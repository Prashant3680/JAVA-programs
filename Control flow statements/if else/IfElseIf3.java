import java.util.Scanner;
class IfElseIf3
{public static void main(String[] args)
 { Scanner sc=new Scanner(System.in);

	System.out.println("Enter your income:");
	double sal=sc.nextDouble();
	double tax;

	if(sal>=0 && sal<300000)
	{ tax=0;
	 System.out.println("Tax payable:"+tax);
	}

	else if(sal>300000 && sal<600000)
	{ tax=sal*0.05;
	 System.out.println("Tax payable:"+tax);
	}

	else if(sal>600000 && sal<900000)
	{ tax=sal*0.1;
	 System.out.println("Tax payable:"+tax);
	}

	else if(sal>=900000 && sal<1200000)
	{ tax=sal*0.15;
	 System.out.println("Tax payable:"+tax);
	}

	else if(sal>1200000 && sal<1500000)
	{ tax=sal*0.2;
	 System.out.println("Tax payable:"+tax);
	}

	else if(sal<0)
	{ System.out.println("Enter correct income.");
	}



	else 
	{ tax=sal*0.3;
	 System.out.println("Tax payable:"+tax);
	}

	


 }

}