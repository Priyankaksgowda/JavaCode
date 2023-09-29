package aug02;
import java.util.*;
public class EmployeeCampany
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of campanies");
		int row=sc.nextInt();
		System.out.println("Enter the number of Employee in each campany");
		int col=sc.nextInt();
		String[][] arrs=new String[row][col];
		for(int i=0;i<=arrs.length-1;i++)
		{
			for(int j=0;j<=arrs[i].length-1;j++)
			{
				System.out.println("Enter the name for company"+(i+1)+"employee"+(j+1));
				arrs[i][j]=sc.next();
			}
		}
		for(int i=0;i<=row-1;i++)
		{
			for(int j=0;j<=col-1;j++)
			{
				System.out.println("the name of company"+(i+1)+"employee"+(j+1)+"is"+arrs[i][j]);

			}
		}

	}

}
