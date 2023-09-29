import java.util.Scanner;

public class HalfTheNumber 
{

	public static void main(String[] args) 
	{Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	double a = sc.nextFloat();
	double res = halfthenumber(a);
	System.out.println("the half of number is: "+res);

}

public  static double halfthenumber(double num)
{
	return(num/2);
		
}

}
