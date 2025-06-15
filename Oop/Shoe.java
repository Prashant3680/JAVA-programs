class Shoe
{
 String brand;
 double price;
 int size;
 String type;
 String colour;

 Shoe(String brand,double price,int size,String type,String colour)
 {
	this.brand=brand;
	this.price=price;
	this.size=size;
	this.type=type;
	this.colour=colour;
 }

 Shoe()
 {
 }

 public void displayShoe()
 {
	System.out.println("Brand: "+brand);
	System.out.println("Price: "+price);
	System.out.println("Size: "+size);
	System.out.println("Type: "+type);
	System.out.println("Colour: "+colour);
 }


}