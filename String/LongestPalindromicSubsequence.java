public class LongestPalindromicSubsequence 
{
	public static void main(String[] args) 
	{
		String s="MadaMspeaksMalylaM";
		System.out.println(longestPalindrome(s));
	}
	
	public static String longestPalindrome(String s)
	{
		String ans="",temp="";
		int maxCount=0,evenCount,oddCount;
		for(int i=0;i<s.length()-3;i++)
		{   
			if(s.charAt(i)==s.charAt(i+1))
			{   temp="";
				int j=i,k=i+1;
				evenCount=2;
				
				while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k))
				{
					evenCount+=2;
					temp=s.charAt(j)+temp+s.charAt(k);
					j--;
					k++;
				}
				
				if(evenCount>maxCount)
				{
					maxCount=evenCount;
					ans=temp;
				}
					
			}
			
			if(s.charAt(i)==s.charAt(i+2))
			{
				 temp=""+s.charAt(i+1);
				 int j=i,k=i+2;
				 oddCount=3;
				 
				 
				 while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k))
					{
						oddCount+=2;
						temp=s.charAt(j)+temp+s.charAt(k);
						j--;
						k++;
					}
				 
				 if(oddCount>maxCount)
					{
						maxCount=oddCount;
						ans=temp;
					}
			}
			
			
		}
		return ans;
		
	}
}