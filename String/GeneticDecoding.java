public class GeneticDecoding 
{
	public static void main(String[] args) 
	{
		String code="000001001011101010010110011";
		System.out.println(genDecode(code));
	}
	
	public static String genDecode(String code)
	{
		String ans="";
		String seq="";
		for(int i=3;i<code.length();i++)
		{			
			seq+=code.charAt(i);
			if(seq.length()==3)
			{
				switch(seq)
				{
					case "001":
					ans+="C";
					break;
					
					case "010":
					ans+="G";
					break;
						
					case "011":
					ans+="A";
					break;
						
					case "101":
					ans+="T";
					break;
						
					case "110":
					if(code.substring(0,3).equals("000"))
					ans+="T";
					else
					ans+="U";
					break;
				}
				seq="";
			}
		}
		
		if(code.substring(0,3).equals("000"))
			ans="DNA-"+ans;
		else
			ans="RNA-"+ans;
			
		return ans;
	}
}