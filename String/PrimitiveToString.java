public class PrimitiveToString 
{
	public static void main(String[] args) {
		
		int i=10;
		String s1=String.valueOf(i);
		System.out.println(s1);
		System.out.println(s1+10);
		
		boolean b=true;
		String s2=String.valueOf(b);
		System.out.println(s2);
		System.out.println(s2+20);
		
		double d=20.20;
		String s3=String.valueOf(d);
		System.out.println(s3);
		System.out.println(s3+10);
		
	}
}