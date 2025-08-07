import java.util.Scanner;

public class ElementFrequency 
{
	public static void main(String[] args) {
		
		int[] ar= {10,2,4,67,4,4,31,52};
		System.out.println("Enter the element: ");
		int ele=new Scanner(System.in).nextInt();
		System.out.println("The frequency of element "+ele+" in array is: "+elementFrequency(ar,ele));
		
	}
	
	public static int elementFrequency(int[] ref,int ele)
	{
		int count=0;
		
		for(int i=0;i<ref.length;i++)
		{
			if(ref[i]==ele)
			count++;
		}
		return count;
	}
}