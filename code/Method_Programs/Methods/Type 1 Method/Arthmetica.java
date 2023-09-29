import java.util.*;
public class Arthmetica
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the long two number:");
long a = sc.nextLong();
long b = sc.nextLong();
System.out.println("the addition of two numbers is "+galaticAddition(a,b));
}
public static long galaticAddition(long num1,long num2)
{
	 long num3=num1+num2;
	return num3;
}
}
