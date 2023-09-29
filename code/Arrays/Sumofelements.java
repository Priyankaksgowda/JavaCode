package aug04;
import java.util.*;
public class Sumofelements 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		SumElements s1=new SumElements();

		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the number"+(i+1)+":");
			arr[i]=sc.nextInt();

		}
		s1.display(arr);

	}

}
