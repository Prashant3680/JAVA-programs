public class WildCardMatching
{
	public static void main(String[] args) 
	{
		String s1="abbbcbcdedef";
		String p1="*****a*bb*cde************";
		System.out.println(match(s1,p1));
		
		String s2="aaabbpqbcde";
		String p2="*a*bcde***";
		System.out.println(match(s2,p2));
		
	}
	
	public static boolean match(String s,String p)
	{
		if(contains(p,"*",0)>=0)
		{
			int index=0;
			int i=0;
			
			while(p.charAt(i)!='*')
			{
				if(s.charAt(i)!=p.charAt(i) && p.charAt(i)!='?')
					return false;
				
				i++;
				index++;
			}
					
			for( ;i<p.length();i++)
			{
				String temp="";
				
				while(p.charAt(i)=='*')         
				{
					i++;
					
					if(i==p.length())
						return true;
				}
				System.out.println("Pointer:"+i);     /////////extra
				
				if(i==p.length()-1&&p.charAt(i)=='?'&&p.charAt(i-1)=='*')    ///////////
					return true;
				
				while(i<p.length() && p.charAt(i)!='*')
				{
					temp+=p.charAt(i++);
				}
				
				if((index=contains(s,temp,index))==-1)         
				{
					return false;                          
				}
				System.out.println("Index:"+index);   /////////extra
				
				if(i==p.length()-1 && p.charAt(i)=='*')
					return true;
				
			}

			System.out.println(i);
			System.out.println(index);
			if(index==s.length()-1 && i>=p.length()-1)
				return true;
			
			return false;
		}
		else
		{
			if(s.length()!=p.length())
				return false;
			
			for(int i=0;i<s.length();i++)
			{
				if(p.charAt(i)!=s.charAt(i) && p.charAt(i)!='?')
					return false;
			}
			
			return true;
		}
		
	}
	
	public static int contains(String s,String p,int index)
	{
		int i=index;
		
		if(i>0)
			i++;
		
		for( ;i<s.length();i++)
		{
			int j=0,start=i;
			while(i<s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'))
			{
				if(j==p.length()-1)
					return i;
				
				if(s.charAt(i+1)!=p.charAt(j+1))  //////////
				{
					i=start;
					//System.out.println(i);
					break;
				}
					
				i++;
				j++;
			}
			
		}
		System.out.println(i); ///////////
		return -1;
	}
	
}