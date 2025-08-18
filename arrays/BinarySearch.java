public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] ar= {43,67,2,45,89,63,85,78,54};
		int search=85;
		
		binarySearch(ar,search);
		
	}
	
	public static void binarySearch(int[] ref,int ele)
	{
		BubbleSortModification.bubbleSort(ref);
		
		int start=0,end=ref.length-1,mid; 
		while(start<=end)
		{
			mid=(start+end)/2;
			
			if(ref[mid]==ele)
			{
				System.out.println("Element "+ele+" found at index: "+mid);
				return;
			}
			
			else if(ref[mid]<ele)
				start=mid+1;
			
			else
				end=mid-1;
		}
		
		System.out.println("Element "+ele+" not found!");
			
	}
	
}