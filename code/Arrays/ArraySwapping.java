 package aug10;
import java.util.*;
public class ArraySwapping 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");	
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter 1st index value");
		int i1=sc.nextInt();
		System.out.println("Enter 2nd index value");
		int i2=sc.nextInt();
		int temp=0;
		System.out.print("before Swapping an array");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		
			if(i1>=0 && i1<=arr.length-1 && i2>=0 && i2<=arr.length-1)
			{
				temp=arr[i1];
				arr[i1]=arr[i2];
				arr[i2]=temp;
			}
			else
			{
				System.out.println("Enter the indexes in the range of 0 to"+(arr.length-1));
				return;
			}
			System.out.println("After Swapping an array");
			for(int i=0;i<=arr.length-1;i++)
			{
		     System.out.print(arr[i]+" ");
			}
			System.out.println();	
	}

}
