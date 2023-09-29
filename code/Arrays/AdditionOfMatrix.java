package aug07;

import java.util.Scanner;

public class AdditionOfMatrix 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows,columns of Matrix 1 & matrix 2");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][] arr1=new int[row][col];
		int [][] arr2=new int[row][col];
		int [][] sum=new int[row][col];
		System.out.println("Enter the numbers of matrix 1:");
		for(int i=0;i<=arr1.length-1;i++)
		{
		 for(int j=0;j<=arr1[i].length-1;j++)
			{
			  arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the numbers of matrix 2:");
		for(int i=0;i<=arr2.length-1;i++)
		{
		 for(int j=0;j<=arr2[i].length-1;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		//sum
		for(int i=0;i<=sum.length-1;i++)
		{
		 for(int j=0;j<=sum[i].length-1;j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		//displaying the matrix
		for(int i=0;i<=sum.length-1;i++)
		{
		 for(int j=0;j<=sum[i].length-1;j++)
			{
		      System.out.print(" "+sum[i][j]+" ");	
			}
		System.out.println(" ");
		}
	}
}


