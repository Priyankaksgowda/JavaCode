package aug04;

import java.util.Scanner;

public class CopyingArray 
{

	public static void main(String[] args) 
	{
		CopyingarrayApp c1=new CopyingarrayApp();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int s=sc.nextInt();
		int[] add=new int[s];
		int[] arr=new int[s];
		for(int i=0;i<arr.length;i++) 
		{
		System.out.println("Enter the array element"+(i+1));
		arr[i]=sc.nextInt();
		}
		
		c1.display(arr, add);
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*CopyingarrayApp c1=new CopyingarrayApp();
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the number"+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		int[] add=new int[size];
		c1.display(arr,add);*/

}
}


