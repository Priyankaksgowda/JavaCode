package aug04;

public class SumElements
{
	public void display(int[] arr)
	{
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}


}
