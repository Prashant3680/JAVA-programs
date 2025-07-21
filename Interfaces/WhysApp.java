public interface WhysApp
{
	int msgLimit=100;
	void message(long phno,String msg);
	void voiceNote(long phno,String msg);
	void status(String ip);
	
	static void greeting(String user)
	{
		System.out.println("Hey! "+user+" Welcome to WhysApp!");
	}
}