import java.util.Scanner;
class EvilNumber
{public static void main(String[] args)
 {
	System.out.print("Enter a number: ");
	int num=new Scanner(System.in).nextInt();
 	int count=0,temp=num;
	String bin=" " ;

	if(num<0)
	num*=-1;

	while(temp>0)
	{
	 if(temp%2==1)
	 count++;

	 temp/=2;
	}
	
	if(count%2==0)
	System.out.println(num+" is an Evil number");
	else
	System.out.println(num+" is not an evil number");

	
 }
}