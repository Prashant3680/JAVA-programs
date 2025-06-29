public class GoogleAccount 
{
	String name;
	long phno;
	String email;
	String pass;
	
	public void displayGoogleAccount()
	{
		System.out.println("Name: "+name);
		System.out.println("Phone no: "+phno);
		System.out.println("Email id: "+email);
		System.out.println("Password: "+pass);
		
	}
		
	public GoogleAccount() {}
	
	public GoogleAccount(String name,long phno,String email,String pass)
	{
		this.name=name;
		this.phno=phno;
		this.email=email;
		this.pass=pass;
	}
}
