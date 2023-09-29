 package aug09;

public class Search 
{
	public static void binarySearch(int[] arr,int key)
	{
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(key==arr[mid])
			{
				System.out.println("key "+key+" is found at index: "+mid);
				return;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
				//high=high;   // this code is hasn't give any effect 
				mid=(low+high)/2;
			}
			else 
			{
				//low=low;   // this code is hasn't give any effect
				high=mid-1;
				mid=(low+high)/2;
			}
			
		}
				System.out.println("key not found");
			
	}

}
