import java.util.*;
public class PlanetExplore 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the area surface of sphere:");
		double a=sc.nextDouble();
		System.out.println("the total surfacearea is: "+calculateSurfaceArea(a));
		}

	public static double calculateSurfaceArea(double radius)
	{
		double res =4*3.14*radius*radius;
		return res;
	}
}
