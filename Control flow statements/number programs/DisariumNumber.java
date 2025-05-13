import java.util.Scanner;
class DisariumNumber
{ public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
 	int num=new Scanner(System.in).nextInt();	
	int count=0,temp=num,sum=0;

	while(temp!=0)
	{temp/=10;
	count++;
	}

	temp=num;
	while(temp!=0)
	{ 
	 int prod=1;

	 for(int i=1;i<=count;i++)
	   prod*=temp%10;
	
	count--;
	sum+=prod;
	temp/=10;
	}

	if(sum==num)
	System.out.println(num+" is a disarium number");
	else
	System.out.println(num+" is not a disarium number");

 }
}