import java.util.Scanner;
class FascinatingNumber2
{
 public static void main(String[] args)
 {
	System.out.print("Enter a number:");
	int num=new Scanner(System.in).nextInt();
	int temp=num,count=0;
	String res="";

	while(temp!=0)
	{temp/=10;
	 count++;
	}

	if(count!=3)
	{System.out.println("please neter anumber with 3 digits");
	return;
	}
	
	for(int i=1;i<=count;i++)
	 res+=num*i;

	temp=Integer.parseInt(res);

	int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0;

	while(temp!=0)
	{ switch(temp%10)
	  {
		case 1:
		count1++;
		break;

		case 2:
		count2++;
		break;

		case 3:
		count3++;
		break;

		case 4:
		count4++;
		break;

		case 5:
		count5++;
		break;

		case 6:
		count6++;
		break;

		case 7:
		count7++;
		break;

		case 8:
		count8++;
		break;

		case 9:
		count9++;
		break;

		default:
		System.out.println(num+" is not a fascinating number");
		return;
		
		
	  }
	  temp/=10;
	}

	if(count1==1&&count2==1&&count3==1&&count4==1&&count5==1&&count6==1&&count7==1&&count8==1&&count9==1)
	System.out.println(num+" is a Fascinating Number");
	else
	System.out.println(num+" is not a fascinating number");
 }
}