package aug04;
import java.util.*;
public class SumofCorresponding 
{

	public static void main(String[] args) 
	{
		SumApp s1 =new SumApp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int s= sc.nextInt();
		int[] arr=new int[s];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the  1st array element");
			arr[i]=sc.nextInt();
		}
		
		
		int[] add=new int[s];
		for(int i=0;i<add.length;i++)
		{
			System.out.println("Enter the 2nd array element");
			add[i]=sc.nextInt();
		}
		s1.display(arr,add,s);
		
		
	}

}
