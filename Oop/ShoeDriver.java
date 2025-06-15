class ShoeDriver
{
 public static void main(String[] a)
 {

	Shoe s1=new Shoe();
	s1.price=5000;
	s1.displayShoe();	

	Shoe s2=new Shoe("Nike",5000.0,10,"Sports","White");
	s1.displayShoe();
 }

}