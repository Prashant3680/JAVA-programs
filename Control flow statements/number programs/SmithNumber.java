import java.util.Scanner;
class SmithNumber
{
 public static void main(String[] args)
 {
	System.out.print("Enter a number:");
	int num=new Scanner(System.in).nextInt();
	int temp=num,sumDigits=0,sumPrimeFactors=0,div=2;

	for(;div<=num/2;div++)
	{ if(num%div==0)
	  break;
	}

	if(div<=num/2)
	{
	   while(temp!=0)
	   { sumDigits+= temp%10;
 	     temp/=10;
	   }

	   for(int i=2;i<=num;i++)
	   { 
	      if(num%i==0)
	      {
	         int j=2;
	         for( ;j<=i/2;j++)
	         {
		   if(i%j==0)
		   break;
                 }
	  
	         if(j>i/2)
	         {  
		     while(num%i==0)
		     { int divisor=i;
		       num/=divisor;
		       while(divisor!=0)
		       {
		         sumPrimeFactors+=divisor%10;
		         divisor/=10;
		       }
		     }
		
	         }
	      }

	  }
	
	  if(sumDigits==sumPrimeFactors)
	  System.out.println("It is a Smith number");
	  else
	  System.out.println("It is not a Smith number");
	}	

	else
	System.out.println("It is not a smith number");
 }
}