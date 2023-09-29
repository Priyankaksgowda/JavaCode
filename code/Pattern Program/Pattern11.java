package jul25;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of row");
		int num=sc.nextInt();
		System.out.println("Enter the Symbol");
		char ch=sc.next().charAt(0);
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-i+1;j++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=(2*i-1);j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
