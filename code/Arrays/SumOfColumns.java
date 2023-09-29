package aug07;

import java.util.Scanner;

public class SumOfColumns 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows,columns of Matrix");
		int [][] arr=new int[sc.nextInt()][sc.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the numbers of matrix:");
				arr[i][j]=sc.nextInt();
				
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int sum=0;
			for(int j=0;j<=arr[i].length-1;j++)
			{
				sum=sum+arr[i][j];
				System.out.print(" "+arr[i][j]+" ");
			}
			System.out.print("--> "+sum+" ");
			System.out.println(" ");
		}


	}

}
