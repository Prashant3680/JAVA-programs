class Battery
{
 String brand;
 double price;
 int mah;
 String type;

 public void displayBattery()
 {
	System.out.println("Brand: "+brand);
	System.out.println("Price: "+price);
	System.out.println("mAh: "+mah);
	System.out.println("Type: "+type);
	
 }

 Battery(){}

 Battery(String brand,double price,int mah,String type)
 {
	this.brand=brand;
	this.price=price;
	this.mah=mah;
	this.type=type;
	System.out.println("Battery created");
 }


}