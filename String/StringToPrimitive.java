public class StringToPrimitive 
{
	public static void main(String[] args) 
	{
		String s1="12";
		byte b=Byte.parseByte(s1);
		System.out.println(b);
		
		String s2="123";
		short s=Short.parseShort(s2);
		System.out.println(s);
		
		String s3="12323";
		int i=Integer.parseInt(s3);
		System.out.println(i);
		
		String s4="123456";
		long l=Long.parseLong(s4);
		System.out.println(l);
		
		String s5="1234.12";
		float f=Float.parseFloat(s5);
		System.out.println(f);
		
		String s6="1234.1234";
		double d=Double.parseDouble(s6);
		System.out.println(d);
		
		String s7="@";
		char ch=s7.charAt(0);
		System.out.println(ch);
		
		String s8="True";
		boolean bl=Boolean.parseBoolean(s8);
		System.out.println(bl);
		
	}
}