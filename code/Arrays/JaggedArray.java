package aug03;
import java.util.*;
public class JaggedArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of companies");
		int c=sc.nextInt();
		String[][] arrs=new String[c][];
		for(int i=0;i<=arrs.length-1;i++)
		{
			System.out.println("Enter the number of employee in company"+(i+1));
			int e=sc.nextInt();
			arrs[i]=new String[e];
		}
		for(int i=0;i<=arrs.length-1;i++)
		{
			for(int j=0;j<=arrs[i].length-1;j++)
			{
				System.out.println("Enter the names of employee in company "+(i+1)+"and employee"+(j+1));
				arrs[i][j]=sc.next();
			}
		}
		for(int i=0;i<=arrs.length-1;i++)
		{
			for(int j=0;j<=arrs[i].length-1;j++)
			{
				System.out.println("the names of employee in company "+(i+1)+"and employee"+"is"+(j+1)+arrs[i][j]);
	}
		}
	}
}
