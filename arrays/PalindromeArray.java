public class PalindromeArray
{
	public static void main(String[] args) 
	{
		int[] ar= {10,20,30,20,10};
		System.out.println(palindromeArray(ar)?"It is a palindrome array":"It is not a palindrome array");
	}
	
	public static boolean palindromeArray(int[] ref)
	{
		for(int i=0;i<ref.length/2;i++)
		{
			if(ref[i]!=ref[ref.length-i-1])
			{
				return false;
			}
			
		}
		return true;
	}
}
