public class GoogleAccountDriver 
{
	public static void main(String[] abc)
	{
	GoogleDrive gd1=new GoogleDrive("Nayan",9876543210l,"Nayan@gmail.com","Nayan123");
	gd1.add("Photo");
	gd1.add("Video");
	gd1.delete("Video");
	gd1.displayGoogleDrive();
	
	Email e1=new Email("Tara",1234567890l,"Tara@gmail.com","Tara456");
	e1.sendMail("Nayan@gmail.com","Send me the notes");
	e1.recieveMail("Nayan@gmail.com","Sent on whatsapp");
	e1.displayEmail();
	}
	
}
