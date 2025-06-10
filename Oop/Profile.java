class Profile
{
	String userId;
	String name;
	String degree;
	int YOP;
	String stream;
	Double degreePerc;
	long contactNo;
	String email;
	int pin;

	public void displayProfile()
	{
	  System.out.println("Name: "+name);
	  System.out.println("User id: "+userId);
	  System.out.println("Contact no: "+contactNo);
	  System.out.println("Email id: "+email);
	  System.out.println("Degree: "+degree);
	  System.out.println("Stream: "+stream);
	  System.out.println("Degree perc: "+degreePerc);
	  System.out.println("Year of passout:"+YOP);
	}

	Profile()
	{

	}

}