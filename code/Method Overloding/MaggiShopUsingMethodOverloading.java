import java.util.Scanner;
class MaggiShopUsingMethodOverloading
{

public static void getMaggi()
{
System.out.println("Bill for normal maggi is 30 rs");
}

public static int getMaggi(int quantity)
{
System.out.println("Bill for"+quantity+"Maggi is(quantity*30)"+"rs");
return quantity;
}

public static int getMaggi(String typ)
{
System.out.println("Bill for"+type+"maggi is 50 rs");
return typ;
}

public static int getMaggi(int quantity,String typ)
{
System.out.println("Bill for"+type+"maggi is(quantity*50)"+"rs");
return quantity;
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter quantity of maggi you want");
int a = sc.nextInt();
System.out.println("enter the maggi Type you want");
String s = sc.nextLine();
getMaggi();
getMaggi(a);
getMaggi(s);
getMaggi(a,s);
}
}
