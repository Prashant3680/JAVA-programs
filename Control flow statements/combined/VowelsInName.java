import java.util.Scanner;
class VowelsInName
{ public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter your name:");
	 String name=sc.next();


	 System.out.print("The vowels in "+name+" are: ");
	 for(int i=0 ; i<name.length() ; i++)
	 {
	 	char c=name.charAt(i);
	 	if(c=='A' || c=='E'|| c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	 	System.out.print(c+" "); 
	 }

	}
}