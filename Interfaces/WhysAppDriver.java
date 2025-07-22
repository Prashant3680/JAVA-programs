public class WhysAppDriver 
{
	public static void main(String[] args) {
		
		WhysApp w1=new WhysAppImp2("Vinod",9876543210l);
		w1.message(9886543210l,"Hi! I am using WhysApp");
		w1.voiceNote(99876543210l, "Hi! How are you?");
		w1.status("Feeling Happy Today!");
		
	}
}
