import java.util.Arrays;

public class BubbleSortModification 
{
public static void main(String[] args) {
		
		int[] ar= {90,85,56,43,27,19};
		bubbleSort(ar);
		System.out.println(Arrays.toString(ar));
	}
	
	public static void bubbleSort(int[] ref)
	{	boolean check=false;
	
		for(int i=0;i<ref.length;i++)
		{
			
			for(int j=0;j<ref.length-1-i;j++)
			{
				if(ref[j]>ref[j+1])
				{	check=true;
					ref[j]=ref[j]+ref[j+1];
					ref[j+1]=ref[j]-ref[j+1];
					ref[j]=ref[j]-ref[j+1];
				}
				
			}
			
			if(!check)
			break;
			
		}
		
	}
}
