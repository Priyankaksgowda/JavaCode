package jul31;
import java.util.*;
public class Array2 
{

	public static void main(String[] args) 
	{
		//creating array using variable arr
		int[] arr=new int[5];
		//using scanner class for scanning user input
		Scanner sc=new Scanner(System.in);
		//asking user to enter the user input
		System.out.println("Enter the Student marks:");
		//storing user input using for loop
		for(int i=0;i<=4;i++)
		{
			//using array and i variable storing the values
			arr[i]=sc.nextInt();
		}
		System.out.println("The students marks are:");
		//display the stored data
		for(int i=0;i<=4;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
