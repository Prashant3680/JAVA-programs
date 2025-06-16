import java.util.Scanner;
class SocialMedia
{
 private String name="Ramesh";
 private int pin=9876;
 private String id="Ramesh5678";
 private long phno=9876543210l;

 public void getDetails()
 {
	System.out.println();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter user id/phno: ");
	String ip=sc.next();
	System.out.print("Enter the pin: ");
	int pin=sc.nextInt();


	if((ip.equals(id) || ip.equals(""+phno)) && pin==this.pin)
	{
	System.out.println();
	  System.out.println("Name: "+name);
	  System.out.println("Pin: "+pin);
	  System.out.println("User id: "+id);
	  System.out.println("Phone no: "+phno);
	}
	else
	System.out.println("Invalid credentials!");
 } 

 public void editDetails()
 {
	System.out.println();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter user id/phno: ");
	String ip=sc.next();
	System.out.print("Enter the pin: ");
	int pin=sc.nextInt();


	if((ip.equals(id) || ip.equals(""+phno)) && pin==this.pin)
	{
	System.out.println("Enter the option below: ");
	System.out.println("1.phno");
	System.out.println("2.pin");
	
	switch(sc.nextInt())
	{
	  case 1:
	  System.out.print("Enter a new phno:");
	  this.phno=sc.nextLong();
	  System.out.println("Phone number updated successfully!");
	  break;

	  case 2:
	  System.out.print("Enter a new pin:");
	  this.pin=sc.nextInt();
	  System.out.println("Pin updated successfully!");
	  break;

	  default:
	  System.out.println("Invalid option entered!");
	  
 	}
	}

	else
	System.out.println("Invalid credentials!");
 }

 SocialMedia(){}

 SocialMedia(String name,int pin,String id,long phno)
 {
	this.name=name;
	this.pin=pin;
	this.id=id;
	this.phno=phno;
 }


}