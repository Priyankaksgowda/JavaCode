package aug04;

public class MergearrayApp
{
	public void display(int[] arr,int[] add)
	{
		int[] copy=new int[arr.length+add.length];
		for(int i=0;i<arr.length;i++)
		{
			copy[i]=arr[i];
		}
		for(int i=0;i<add.length;i++)
		{
			copy[arr.length+i]=add[i];
			
		}
		for(int i=0;i<copy.length;i++)
		{
		System.out.println(copy[i]);
		}
		
		
	}

	
}
