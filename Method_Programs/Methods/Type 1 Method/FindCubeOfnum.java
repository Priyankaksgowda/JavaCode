import java.util.*;
	public class FindCubeOfnum 
	{

		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number:");
			int a=sc.nextInt();
			System.out.println("the cube of "+a+"is:"+cubenum(a));

		}
	public static int cubenum(int n)
	{
		return(n*n*n);
	}
	}

