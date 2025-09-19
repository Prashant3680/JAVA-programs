import java.util.Arrays;
public class UnionOfArrays 
{
	public static void main(String[] args) 
	{
		int[] a= {34,87,65,45,42,90,41,63};
		int[] b= {56,60,34,67,46,65};
		System.out.println(Arrays.toString(unionOfArrays(a,b)));
	}
	
	public static int[] unionOfArrays(int[] ref1,int[] ref2)
	{
		int[] rep=repeatedElements(ref1,ref2);
		int[] ans=new int[ref1.length+ref2.length-rep[rep.length-1]];
				
		for(int i=0,j=0;i<ref1.length+ref2.length;i++)
		{
			if(i<ref1.length)
				ans[j++]=ref1[i];
			
			else if(rep[i-ref1.length]!=-1)
				ans[j++]=ref2[i-ref1.length];
				
				
		}
		return ans;
	}
	
	public static int[] repeatedElements(int[] ref1,int[] ref2)
	{
		int[] rep=new int[ref2.length+1];
		int count=0;
		
		for(int i=0;i<ref1.length;i++)
		{
			for(int j=0;j<ref2.length;j++)
			{
				if(ref1[i]==ref2[j])
				{
					rep[j]=-1;
					count++;
				}
			}
		}
		
		rep[rep.length-1]=count;
		return rep;
		
	}
	
}