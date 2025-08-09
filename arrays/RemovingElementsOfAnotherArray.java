import java.util.Arrays;
public class RemovingElementsOfAnotherArray 
{
	public static void main(String[] args) 
	{
		int[] a= {12,65,38,92,65,76,3,9,1,0,67};
		int[] b= {20,65,49,12,55,67};
		
		System.out.println(Arrays.toString(removeAnotherArrayElements(a,b)));
		
	}
	
	public static int[] removeAnotherArrayElements(int[] ref1,int[] ref2)
	{
		int[] ans=new int[ref1.length-commonElements(ref1,ref2)];
		
		for(int i=0,j=0;i<ref1.length;i++)
		{
				if(!searchElement(ref2,ref1[i]))
				{	ans[j]=ref1[i];
					j++;
				}
					
		}
		
		return ans;
		
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
	
	public static int commonElements(int[] ref1,int[] ref2)
	{
		int ct=0;
		
		for(int i=0;i<ref1.length;i++)
		{
			if(searchElement(ref2,ref1[i]))
				ct++;
		}
		
		return ct;
		
	}
	
}