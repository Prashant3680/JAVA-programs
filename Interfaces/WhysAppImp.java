public abstract class WhysAppImp implements WhysApp
{
	String user;
	long phno;
	int msgCount;
	
	public void message(long phno,String msg)
	{
		if(msgCount<=msgLimit)
		{
			System.out.println(msg);
			System.out.println("Message sent!");
			msgCount++;
		}
		else
			System.out.println("Daily Message limit exceeded!");
	}
	
	public void voiceNote(long phno,String msg)
	{
		if(msgCount<=msgLimit)
		{
			System.out.println(msg);
			System.out.println("Message sent!");
			msgCount++;
		}
		else
			System.out.println("Daily Message limit exceeded!");
	}
	
	public WhysAppImp() 
	{
		System.out.println("Account created Successfully!");
	}
	
	public WhysAppImp(String user,long phno)
	{
		this.user=user;
		this.phno=phno;
		System.out.println("Account created Successfully!");
	}
	
	
	
}
