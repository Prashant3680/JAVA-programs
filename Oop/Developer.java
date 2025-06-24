class Developer extends SoftwareEngineer 
{
	String techStack;
	int project;
	String role;
	String domain;
	
	public void displayDeveloper()
	{
		displaySoftwareEngineer();
		
		System.out.println("TechStack: "+techStack);
		System.out.println("No of Projects: "+project);
		System.out.println("Role: "+role);
		System.out.println("Domain: "+domain);
	}
	
	public Developer()
	{
		
	}
	
	public Developer(String name,int empId,String company,String degree,int exp,double sal,String techStack,int project,String role,String domain)
	{
		this.name=name;
		this.empId=empId;
		this.company=company;
		this.degree=degree;
		this.exp=exp;
		this.sal=sal;
		
		this.techStack=techStack;
		this.project=project;
		this.role=role;
		this.domain=domain;
		
	}
	
	
}