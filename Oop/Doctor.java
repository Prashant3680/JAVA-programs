public class Doctor 
{
	String name;
	String hospital;
	String dept;
	int exp;
	long tel;
	String add;
	
	public void displayDoctor()
	{
		System.out.println("Name: "+name);
		System.out.println("Hospital: "+hospital);
		System.out.println("Contact: "+tel);
		System.out.println("Department: "+dept);
		System.out.println("Experience: "+exp);
		System.out.println("Address: "+add);
		System.out.println("-------------------");
	}
	
	public Doctor() {}
	
	public Doctor(String name,String hospital,String dept,int exp,long tel,String add)
	{
		this.name=name;
		this.hospital=hospital;
		this.dept=dept;
		this.exp=exp;
		this.tel=tel;
		this.add=add;
	}
	
}
