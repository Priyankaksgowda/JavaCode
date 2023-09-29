import java.util.*;
public class BasicOpertatorUsingReturn
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
int a = sc.nextInt();
System.out.println("Enter the second number:");
int b = sc.nextInt();

System.out.println("the subtraction of two numbers is "+sub(a,b));
System.out.println("the multiplication of two numbers is "+mul(a,b));
System.out.println("the division of two numbers is "+div(a,b));
System.out.println("the remainder of two numbers is "+rem(a,b));
}
public static int sub(int x,int y)
{
	int z=x-y;
	return z;
}
public static int mul(int x,int y)
{
	int z=x*y;
	return z;
}
public static double div(double x,double y)
{
	double z=x/y;
	return z;
}
public static int rem(int x,int y)
{
	int z=x%y;
	return z;
}
}

