class Increment
{
 public static void main(String[] args)
 {
	int poc=100;  //107
	System.out.println(poc++);  //100
	System.out.println(++poc);  //102
	System.out.println(poc++ + poc);  //205
	System.out.println(poc++ + ++poc);  //208
	System.out.println(poc);  //105
	System.out.println(++poc + poc++);  //212
	System.out.println(poc);  //107
 }
}