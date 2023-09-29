import java.util.*;
public class HeightConverter 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in inches:");
		double a = sc.nextDouble();
		System.out.println("the number in feet is: "+convertInchesToFeet(a));

	}

	public  static double convertInchesToFeet(double inches)
	{
		double res = inches/12;
		return res;
	}
}
