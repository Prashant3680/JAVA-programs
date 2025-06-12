class WatchDriver
{
 public static void main(String[] a)
 {
	Watch w1=new Watch();
	w1.displayDetails();

	Watch w2=new Watch("Rolex",100000.0,"Metallic","Analog");
	w2.displayDetails();
 }

}