

import java.util.Scanner;

public class FcatorialProgram
{

	public static void main(String[] args) 
	{

		FcatorialProgram p4=new FcatorialProgram();
		Scanner sc = new Scanner(System.in);	
	    System.out.println("Enter the number:");
	    int num= sc.nextInt();
	    p4.show(num);

	}

}


public class Program4 
{
	public void show(int x)
	{
		
		int fact=1;
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
	}

}

