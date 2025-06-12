class Watch
{
 String brand;
 double price;
 String colour;
 String type;
 
 public void displayDetails()
 {
	System.out.println("Brand: "+brand);
	System.out.println("Price: "+price);
	System.out.println("Colour: "+colour);
	System.out.println("Type: "+type);		
 }

 Watch()
 {}

 Watch(String brand,double price,String colour,String type)
 {
	this.brand=brand;
	this.price=price;
	this.colour=colour;
	this.type=type;
 }

}