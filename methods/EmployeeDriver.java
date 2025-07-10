class EmployeeDriver 
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("Raghav",1234,50000.0,"Developer","MindTree",4);
		Employee e2=new Employee("Raghav",1234,50000.0,"Developer","MindTree",4);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		
	}
	
	
}