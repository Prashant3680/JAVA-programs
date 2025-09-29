public class ReverseWord 
{
	public static void main(String[] args) 
	{
		String sent ="To be hu@m*an i,s to be be%au#ti$ful!";
		System.out.println(sent);
		System.out.println(reverseWord(sent));
	}
	
	public static String reverseWord(String sent)
	{
		String ans="";
		String word="";
		for(int i=0;i<sent.length();i++)
		{
			if(sent.charAt(i)==' ' || i==sent.length()-1)
			{
				if(i==sent.length()-1)
					word+=sent.charAt(i);
				
				ans+=reverse(word)+" ";
				word="";
			}
			else
			{
				word+=sent.charAt(i);
			}
		}
		return ans;
	}
	
	public static String reverse(String word)
	{
		char[] ans=stringToChar(word);
		
		int i=0,j=ans.length-1;
		while(i<j)
		{
			if(isSpecialChar(ans[i]))
			{
				i++;
			}
			if(isSpecialChar(ans[j]))
			{
				j--;
			}
				
			
			char temp=ans[i];
			ans[i]=ans[j];
			ans[j]=temp;
			
			i++;
			j--;
			
		}
		
		return arrayToString(ans);
	}
	
	public static char[] stringToChar(String s)
	{
		char[] ans=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ans[i]=s.charAt(i);
		}
		
		return ans;
	}
	
	public static String arrayToString(char[] ch)
	{
		String ans="";
		for(int i=0;i<ch.length;i++)
		{
			ans+=ch[i];
		}
		
		return ans;
	}
	
	public static boolean isSpecialChar(char ch)
	{
		return !(ch>='0'&&ch<='9'||ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') ;
	}
	
	
}