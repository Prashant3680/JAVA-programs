public abstract class Calculator 
{
	public abstract void addition(int n1,int n2);
	public abstract void subtraction(int n1,int n2);
	public void division(int n1,int n2)
	{
		System.out.println(n1/n2);
	}
	public abstract void multiplication(int n1,int n2);
	
}