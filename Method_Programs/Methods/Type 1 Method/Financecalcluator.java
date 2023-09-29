import java.util.*;
public class Financecalcluator 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for principle, rate , time:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("the total intrest is:"+calcluateintrest(a,b,c));
	}
public static double calcluateintrest(double intrest,double rate,double time)
{
	double res=intrest*rate*time;
	return res;
}
}
