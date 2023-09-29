package aug03;
import java.util.*;
public class JaggedEmployeeSalary {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of cities");
		int cit=sc.nextInt();
		int [][][] arr=new int [cit][][];
		
		   for(int i=0;i<=arr.length-1;i++)
		    {
			System.out.println("Enter the number of company present in city"+(i+1));
			int com=sc.nextInt();
			arr[i]=new int[com][];
		
			 for(int j=0;j<=arr[i].length-1;j++)
			  {
			    System.out.println("Enter the number of employee in the company"+(j+1));
			    int emp=sc.nextInt();
			     arr[i][j]=new int[emp];
		      }
			}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
				System.out.println(" Enter the salary of employee"+(k+1)+"working in company"+(j+1)+"present in city"+(i+1));
				arr[i][j][k]=sc.nextInt();
			}
		}
		
	}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
				System.out.println("the salary of employee "+(k+1)+" working in "+(j+1)+" present in city "+(i+1)+" is "+arr[i][j][k]);
				
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
	}
}
