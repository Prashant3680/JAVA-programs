public interface Shapes 
{
	public static final double PI_VALUE=22.0/7.0;
	
	void areaOfSquare(int side);
	
	void perimeterOfSquare(int side);
	
	void circumference(int rad);
	
	void areaOFCircle(int rad);
	
	static void message()
	{
		System.out.println("Good calculator");
	}
	
	
}