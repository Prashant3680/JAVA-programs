class Mobile
{
 String brand;
 double price;
 String name;
 int ram,rom;
 String processor;
 Battery b1;

 public void displayMobile()
 {
	System.out.println("Brand: "+brand);
	System.out.println("Name: "+name);
	System.out.println("Price: "+price);
	System.out.println("RAM: "+ram);
	System.out.println("ROM: "+rom);
	System.out.println("Processor: "+processor);
	System.out.println("----------------------------");
	
 }

 Mobile(){}

 Mobile(String brand,double price,String name,int ram,int rom,String processor,String batBrand,double batPrice,int mah,String type)
 {
	this.brand= brand;
	this.name=name;
	this.price=price;
	this.ram=ram;
	this.rom=rom;
	this.processor=processor;

	b1=new Battery(batBrand,batPrice,mah,type);
	System.out.println("Mobile created");
	
 }



}