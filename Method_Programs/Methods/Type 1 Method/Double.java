import java.util.*;
public class Double 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		System.out.println("The result of doubling the numbefr is "+doubleNumber(a));
		}

	public static int doubleNumber(int n)
	{
		return(n*2);
		
    }
}
