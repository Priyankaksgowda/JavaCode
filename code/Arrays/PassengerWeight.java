package jul31;
import java.util.*;
public class PassengerWeight 
{

	public static void main(String[] args)
	{
		//creating array
		double[] arrd=new double[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Passenger weight as kg:");
		double sum=1;
		//Storing data
		for(int i=0;i<=arrd.length-1;i++)
		{
			arrd[i]=sc.nextDouble();
		}
		for(int i=0;i<arrd.length-1;i++)
		{
			sum=sum+arrd[i];
		}
		if(sum<=800)
		{
			System.out.println("lift is working..."+sum);
		}
		else
		{
			System.out.println("lift is not working...."+sum);
		}

	}

}
