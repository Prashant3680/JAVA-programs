public class Anagram 
{
	public static void main(String[] args) 
	{
		String s1="Listen";
		String s2="Silent";
		System.out.println(isAnagram(s1,s2)?"It is anagram":"It is not an anagram");
	}
	
	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		int[] check1=new int[26];
		int[] check2=new int[26];
		
		char ch1,ch2,ch3,ch4;
		
		for(int i=0,j=s1.length()-1;i<=j;i++,j--)
		{
			ch1=s1.charAt(i);
			ch2=s2.charAt(i);
			ch3=s1.charAt(j);
			ch4=s2.charAt(j);
			
			
			if(ch1>='A'&&ch1<='Z') 
				ch1+=32;
			if(ch2>='A'&&ch2<='Z')
				ch2+=32;
			if(ch3>='A'&&ch3<='Z') 
				ch3+=32;
			if(ch4>='A'&&ch4<='Z')
				ch4+=32;
			
			check1[ch1-97]++;
			check2[ch2-97]++;
			if(i!=j)
			{
				check1[ch3-97]++;
				check2[ch4-97]++;
			}
		}
		
		for(int i=0,j=check1.length-1;i<=j;i++,j--)
		{
			if(check1[i]!=check2[i] || check1[j]!=check2[j])
				return false;
		}
		
		return true;
	}
	
	
}