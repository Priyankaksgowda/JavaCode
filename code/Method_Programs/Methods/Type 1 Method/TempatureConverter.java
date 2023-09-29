import java.util.*;
public class TempatureConverter {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the tempature in fahrenheit:");
		float x =sc.nextFloat();
		System.out.println("the tempature is displayed in celsius is:"+tempconverter(x));

	}
public static double tempconverter(double fahrenheit)
{
	return (fahrenheit-32)*5/9;
}
}
