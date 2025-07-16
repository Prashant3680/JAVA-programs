class ShapesImp implements Shapes
{
	public void areaOfSquare(int side)
	{
		System.out.println("Area: "+side*side);
	}
	
	public void perimeterOfSquare(int side)
	{
		System.out.println("Perimeter: "+4*side);
	}
	
	public void circumference(int rad)
	{
		System.out.println("Circumference: "+2*PI_VALUE*rad);
	}
	
	public void areaOFCircle(int rad)
	{
		System.out.println("Area: "+PI_VALUE*rad*rad);
	}
	
	public static void message()
	{
		System.out.println("Bad calculator");
	}
	
}