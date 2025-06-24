class SoftwareEngineer 
{
	String name;
	int empId;
	String company;
	String degree;
	int exp;
	double sal;
	
	public void displaySoftwareEngineer()
	{
		System.out.println("Name: "+name);
		System.out.println("Employee id: "+empId);
		System.out.println("Company: "+company);
		System.out.println("Degree: "+degree);
		System.out.println("Exp: "+exp);
		System.out.println("Salary: "+sal);
		System.out.println("---------------------");
	}
	
	public SoftwareEngineer()
	{
		
	}
	
	public SoftwareEngineer(String name,int empId,String company,String degree,int exp,double sal)
	{
		this.name=name;
		this.empId=empId;
		this.company=company;
		this.degree=degree;
		this.exp=exp;
		this.sal=sal;
	}
	
}
