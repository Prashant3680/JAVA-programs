public class Cardiologist extends Doctor
{
	String spec;
	String organ;
	double sal;
	
	public void displayCardiologist()
	{
		displayDoctor();
		System.out.println("Specialization: "+spec);
		System.out.println("Organ: "+organ);
		System.out.println("Salary: "+sal);
		
	}
	
	public Cardiologist() {}
	
	public Cardiologist(String name,String hospital,String dept,int exp,long tel,String add,String spec,String organ,double sal)
	{
		super(name,hospital,dept,exp,tel,add);
		this.spec=spec;
		this.organ=organ;
		this.sal=sal;
	}
	
}