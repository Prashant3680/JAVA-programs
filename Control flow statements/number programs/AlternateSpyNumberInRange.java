import java.util.Scanner;
class AlternateSpyNumberInRange
{ public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter lower limit:");
	 int lower=sc.nextInt();
	 System.out.print("Enter upper limit: ");
	 int upper=sc.nextInt();
	int count=0,count1=0;

	if(lower>upper)
	{
	System.out.println("Range enetered is wrong");
	return;
	}

	for(int i=lower;i<=upper; i++)
	{
	 int temp=i,sum=0,prod=1;

	 while(temp!=0)
	{
		sum+=temp%10;
		prod*=temp%10;
		temp/=10;
	}

	if(sum==prod)
	{
	  count++;
	  if(count%2==1)
	  {
          System.out.println(i);
	  count1++;
	  }
	}
	 
	}
	System.out.println("Count of Alternate spy numbers in the range "+lower+"-"+upper+" is: "+count1);
	 
 }
}