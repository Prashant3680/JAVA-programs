class Employee 
{
	String name;
	int empId;
	double sal;
	String role;
	String comp;
	int exp;
	
	Employee(){}
	
	Employee(String name,int empId,double sal,String role,String comp,int exp)
	{
		this.name=name;
		this.empId=empId;
		this.sal=sal;
		this.role=role;
		this.comp=comp;
		this.exp=exp;
	}
	
	public String toString()
	{
		return "Name: "+name+",Employee Id: "+empId+",Salary: "+sal+",Role: "+role+"Company: "+comp+"Experience: "+exp ;
	}
	
	public boolean equals(Object o)
	{
		Employee e=(Employee)o;
		return this.name==e.name&&this.empId==e.empId&&this.sal==e.sal&&this.role==e.role&&this.comp==e.comp&&this.exp==e.exp;
	}
	
}
