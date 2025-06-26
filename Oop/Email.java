public class Email extends GoogleAccount
{
	int inbox;
	int sent;
	int bin;
	
	public void sendMail(String email,String content)
	{
		System.out.println("Mail sent");
		sent++;
	}
	
	public void recieveMail(String email,String content)
	{
		System.out.println("Mail recieved");
		inbox++;
	}
	
	public void deleteMail(String email)
	{
		System.out.println("Mail deleted");
		bin++;
		inbox--;
	}
	
	public Email()
	{
	}
	
	public Email(String name,long phno,String email,String pass)
	{
		super(name,phno,email,pass);
	}
	
	public void displayEmail()
	{
		displayGoogleAccount();
		System.out.println("Inbox: "+inbox);
		System.out.println("sent: "+sent);
		System.out.println("Recycle bin: "+bin);
		System.out.println("----------------------------------------------");
		
	}
	
	
}