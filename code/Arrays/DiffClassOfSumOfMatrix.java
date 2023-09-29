package aug07;

import java.util.Scanner;

public class DiffClassOfSumOfMatrix 
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
		storeM1(arr1);
		storeM2(arr2);
		sumM1M2(arr1,arr2,sum);
		displayM1M2(arr1,arr2,sum);
	}
	
	public static void storeM1(int[][]arr1)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of matrix 1:");
		for(int i=0;i<=arr1.length-1;i++)
		{
		 for(int j=0;j<=arr1[i].length-1;j++)
			{
			  arr1[i][j]=sc.nextInt();
			}
		}
	}
	public static void storeM2(int[][]arr2)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of matrix 2:");
		for(int i=0;i<=arr2.length-1;i++)
		{
		 for(int j=0;j<=arr2[i].length-1;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
	}
	public static void sumM1M2(int [][]arr1,int [][]arr2,int [][]sum)
	{
	  for(int i=0;i<=sum.length-1;i++)
		{
		 for(int j=0;j<=sum[i].length-1;j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
	}
		//displaying the matrix
	public static void displayM1M2(int[][]sum,int[][]arr1,int arr2[][])
	{
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

