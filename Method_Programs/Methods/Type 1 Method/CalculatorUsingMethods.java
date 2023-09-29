import java.util.Scanner;
class Calculator1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the two numbers");
int a = sc.nextInt();
int b = sc.nextInt();
int res1 = add(a,b);
System.out.println("The addition of "+a+" and "+b+"is"+res1);
int res2 = sub(a,b);
System.out.println("The subtraction of "+a+" and "+b+"is"+res2);
int res3 = mul(a,b);
System.out.println("The multiplication of "+a+" and "+b+"is"+res3);
int res4 = div(a,b);
System.out.println("The division of "+a+" and "+b+"is"+res4);
}
public static int add(int x,int y)
{
return x+y;
}
public static int sub(int x,int y)
{
return x-y;
}
public static int mul(int x,int y)
{
return x*y;
}
public static int div(int x,int y)
{
return x/y;
}
}
