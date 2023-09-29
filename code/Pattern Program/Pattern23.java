package jul26;

import java.util.Scanner;

public class Pattern23 
{

	public static void main(String[] args)
	{
		int evencount=2;
		int oddcount=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		//if(n%2!=0)
		//{
		//	System.out.println("Enter the even number");
		//}
		for(int row=1;row<=n/2;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(evencount>=9)
				{
					System.out.print("0"+evencount+"");
					evencount+=2;
				}
			}
		}
		System.out.println();
		for(int row=1;row<=n/2;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(oddcount>=9)
				{
					System.out.print("0"+oddcount+"");
					oddcount+=2;
				}
			}
		}	
	 }
  }


