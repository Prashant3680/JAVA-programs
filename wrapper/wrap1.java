public class wrap1 
{
	
	public static void main(String[] args) 
	{
		int i1=10;
		Integer i2=new Integer(i1);    //boxing
		System.out.println(i2);
		
		int i3=i2.intValue();      //unboxing
		System.out.println(i3);
		
		int i4=i1;               //auto unboxing
		System.out.println(i4);
		
		Double d=10.0;
		System.out.println(d.equals(i1));
	
		
	}

}
