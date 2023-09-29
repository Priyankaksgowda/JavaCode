package jul26;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of row");
		int n=sc.nextInt();
		int count=n*n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(count<=9)
				{
				System.out.print(count);
				count--;
			    }
				else
				{
				System.out.print(count);
				count--;
				}
			}
			System.out.println("");
		}
	}

}
