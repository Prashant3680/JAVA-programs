import java.util.Arrays;

public class AlternateMerge 
{
	public static void main(String[] args)
	{
		int[] a= {10,20,30,40,50};
		int[] b= {60,70,80};
		
		int[] c=alternateMerge(a,b);
		System.out.println(Arrays.toString(c));
	}
	
	public static int[] alternateMerge(int[] a,int[] b)
	{
		int[] res=new int[a.length+b.length];
		
		for(int i=0,ia=0,ib=0;i<res.length;i++)
		{
			if(i%2==0 && ia<a.length && ib<b.length)
			{
				res[i]=a[ia];
				ia++;
			}
			else if(i%2!=0&& ia<a.length && ib<b.length)
			{
				res[i]=b[ib];
				ib++;
			}
			else if(ia==a.length)
			{
				res[i]=b[ib];
				ib++;
			}
			else if(ib==b.length)
			{
				res[i]=a[ia];
				ia++;
			}
			
		}
		return res;
		
	}
	
	
}