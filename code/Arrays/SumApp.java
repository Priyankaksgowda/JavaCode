package aug04;

public class SumApp 
{
	public void display(int[] arr,int[] add,int s)
	{
		int[] cop=new int[s];
		for(int i=0;i<s;i++)
		{
			cop[i]=arr[i]+add[i];
			System.out.println("The sum of "+(i+1)+" element is:"+cop[i]);
		}
		
	}

}
