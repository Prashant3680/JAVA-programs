import java.util.Scanner;
class FascinatingNumber
{
 public static void main(String[] args)
 {

	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	int temp=num,digitCount=0;
	String res="";

	while(temp!=0)
	{ temp/=10;
	  digitCount++;
	}

	if(digitCount!=3)
	{System.out.println("Please eneter a number with 3 digits");
	 return;
	}

	for(int i=1;i<=digitCount;i++)
	res+=num*i;

	temp=Integer.parseInt(res);

	for(int digit=1;digit<=9;digit++)
	{ int tempN=temp;
	  int count=0;
	  while(tempN!=0)
	 {
	   if(temp%10==digit)
		count++;

	  tempN/=10;
	 }
	
	 if(count!=1)
	 {
	 System.out.println(num+" is not a Fascinating number");
	 return;
	 }

	}
	
	System.out.println(num+" is a fascinating number");
	

 }
}