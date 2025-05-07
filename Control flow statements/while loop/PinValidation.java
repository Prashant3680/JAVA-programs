import java.util.Scanner;
class PinValidation
{public static void main(String[] args) throws InterruptedException
 {
 	Scanner sc=new Scanner(System.in);
 	int setPin=1234;
  	int time=5000;

 	outerLoop:
 	for( ; ; )
 	{ int attempts=3;
 	 while(attempts>0)
 	 {
 	  System.out.print("Enter the pin:");
 	  int pin=sc.nextInt();
 	  
 	  if(pin==setPin)
 	  {
 	   System.out.println("Login Successful!");
 	   break outerLoop;
 	  }
 	  attempts--;
 	  System.out.println("Attempts left: "+attempts);
 	  System.out.println();
 	 
 	 }
  	 System.out.println("Phone disabled for "+(time/1000)+" seconds");
 	 Thread.sleep(time);
 	 time*=2;	 

 	}




 }
}