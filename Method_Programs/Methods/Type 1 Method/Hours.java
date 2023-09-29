import java.util.*;
public class Hours 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the minutes:");
		int a = sc.nextInt();
		double res=ConvertHoursToMinutes(a);
		System.out.println("the equilent number of hours is:"+res);
    }
 public static double ConvertHoursToMinutes(int minutes)
 {
	double x;
	x=(int)minutes/60.0;
	return x;
}
}
