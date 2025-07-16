class ShapesDriver 
{
	public static void main(String[] args) {
		
		Shapes s1=new ShapesImp();
		s1.areaOfSquare(10);
		s1.perimeterOfSquare(10);
		
		s1.circumference(20);
		s1.areaOFCircle(20);
		
		Shapes.message();
	}
}