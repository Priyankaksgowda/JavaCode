package aug10;
import java.util.*;
public class BinarySortSearching 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array size:");
		int s=sc.nextInt();
		int[] arr = new int[s];
		System.out.println("Enter the array element");
		for(int i=0;i<=arr.length-1;i++)
		{
		   arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-2;i++)
		{
			int temp;
			for(int j=0;j<=arr.length-i-2;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				else
				{
					System.out.println("the array is outof bound");
				}
			}
		}
		System.out.println("sorted array is");
		for(int i=0;i<=arr.length-1;i++)
		{
			{
		System.out.println( arr[i]);
			}
		}
	}

}
