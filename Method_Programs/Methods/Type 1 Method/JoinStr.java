import java.util.*;
public class JoinStr
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String a = sc.nextLine();
		System.out.println("Enter your last name:");
		String b = sc.nextLine();
		System.out.println("Your  full name is "+joinStrings(a,b));

	}

	public static String joinStrings(String str1,String str2)
	{
		return(str1+str2);
	}
}
