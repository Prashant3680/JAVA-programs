import java.util.Scanner;
class SplitNumber2
{
 public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
	int temp=num,count=0,firstHalf=0,secondHalf=0,j=1,k=1;

	while(temp>0)
	{ count++;
	 temp/=10;
	}

	if(count%2==1)
	{ System.out.println("Please eneter a number with even digits");
	 return;
	}

	for(int i=count;i>0;i--)
	{
	  if(i>count/2)
	  {
		secondHalf+=num%10*j;
		j*=10;
	  }
	  else
	  {
	  	firstHalf+=num%10*k;
		k*=10;
	  }

	  num/=10;
	}	
	
	System.out.println("First half: "+firstHalf);
	System.out.println("Seconf half: "+secondHalf);
 }
}