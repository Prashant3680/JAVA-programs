public class WhysAppImp2 extends WhysAppImp
{
	public void message(long phno,String msg)
	{
		if(msgCount<=msgLimit)
		{
			System.out.println(msg);
			System.out.println("Message sent!");
			msgCount++;
			System.out.println("The message is end-to-end encrypted!");
		}
		else
			System.out.println("Daily Message limit exceeded!");
	}
	
	public void status(String ip)
	{
		System.out.println(ip);
		System.out.println("Status updated!");
	}
	
	public WhysAppImp2()
	{
		super();
	}
	
	public WhysAppImp2(String user,long phno)
	{
		super(user,phno);		
	}
}
