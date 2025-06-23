class Pendrive 
{
	String brand;
	double price;
	int memory;
	int speed;
	
	public void displayPendrive()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Memory: "+memory);
		System.out.println("Speed: "+speed);
		
	}
	
	Pendrive(){}
	
	Pendrive(String brand,double price,int memory,int speed)
	{
		this.brand=brand;
		this.price=price;
		this.memory=memory;
		this.speed=speed;
		
	}
	
	
	
}
