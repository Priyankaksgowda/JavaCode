package jul31;
import java.util.*;
public class Array1 
 {

	public static void main(String[] args)
	{
		double[] arr=new double[7];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the percentage");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextDouble();
		}
		System.out.println("The students percentage is:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
