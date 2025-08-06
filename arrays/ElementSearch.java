import java.util.Scanner;
public class ElementSearch 
{
	public static void main(String[] args) {
		
		int[] ar= {10,2,4,67,31,52};
		System.out.println("Enter the element to search: ");
		int ele=new Scanner(System.in).nextInt();
		System.out.println(searchElement(ar,ele)?"The element is present":"The element is not present");
		
	}
	
	public static boolean searchElement(int[] ref,int ele)
	{
		for(int i=0;i<ref.length;i++)
		{
			if(ref[i]==ele)
			return true;
		}
		return false;
	}
}