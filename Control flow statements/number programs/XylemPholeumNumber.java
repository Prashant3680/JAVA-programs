import java.util.Scanner;
class XylemPholeumNumber
{ public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	int sumOut=0,sumIn=0,temp=num;

	if(num<100)
	{
	 System.out.println("Entered number should have at least 3 digits");
	 return;
	}

	while(temp!=0)
	{
	  if(temp==num || temp<10)
	  sumOut+=temp%10;

	  else
	  sumIn+=temp%10;

	 temp/=10;
	}
	
	
	if(sumOut==sumIn)
	System.out.println(num+" is an Xylem number");
	else
	System.out.println(num+" is not an Pholeum number");

 }
}