 
import java.util.*;
public class LinearSearchh 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<=size-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key element to be searched:");
		int key=sc.nextInt();
		System.out.println(display(arr,key));

	}
	public static String display(int[]arr,int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				return("key "+arr[i]+" is found at index "+i);
			}
		}
		
		return("key not found");
	}

}
