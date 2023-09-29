package aug04;

public class CopyingarrayApp 
{
	public void display(int[] arr,int[] add)
	{
	for(int i=0;i<add.length;i++)
   {
	add[i]=arr[i];
	System.out.println(add[i]);
   }

	}
}
