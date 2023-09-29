import java.util.*;
public class TimeSpeed 
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the speed of your journey:");
	double a=sc.nextDouble();
	System.out.println("Enter the time of your journey:");
	double b=sc.nextDouble();
	System.out.println("the Total journey calculator is :"+journeycal(a,b));
}
 public static double journeycal(double x,double y)
 {
	 return(x*y);
 }
}

