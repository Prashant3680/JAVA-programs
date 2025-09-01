import java.util.Arrays;

public class IntersectionOfArrays
{
	public static void main(String[] args) {
		
		int[] a= {34,87,65,45,42,90,41,63};
		int[] b= {56,60,34,67,46,65};
		System.out.println(Arrays.toString(intersectionOfArrays(a,b)));
	}
	
	public static int[] intersectionOfArrays(int[] ref1,int[] ref2)
	{
		int[] rep=repeatedElements(ref1,ref2);
		int[] ans=new int[rep[rep.length-1]];
				
		for(int i=0,j=0;i<ref2.length;i++)
		{
			if(rep[i]==-1)
				ans[j++]=ref2[i];
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