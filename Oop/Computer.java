class Computer 
{
 String brand;
 double price;
 int ram,rom;
 String processor;
 Pendrive p1;
 
 public void displayComputer()
 {
	 System.out.println("Brand: "+brand);
	 System.out.println("Price: "+price);
	 System.out.println("RAM: "+ram);
	 System.out.println("ROM: "+rom);
	 System.out.println("Processor: "+processor);
	 System.out.println("-----------------------");
	 
	 
 }
 
 Computer(){}
 
 Computer(String brand,double price,int ram,int rom,String processor)
 {
	 this.brand=brand;
	 this.price=price;
	 this.ram=ram;
	 this.rom=rom;
	 this.processor=processor;
 }
 
 public void insertPendrive()
 {
	p1=new Pendrive("SanDisk",2000,16,3000);
	System.out.println("Pendrive inserted");
 }
 
 
}
