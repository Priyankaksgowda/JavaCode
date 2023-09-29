package qns8;
import java.util.Scanner;
public class FindSqureOfnum {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		System.out.println("the Squre of "+a+"is:"+squarenum(a));

	}
public static int squarenum(int n)
{
	return(n*n);
}
}
