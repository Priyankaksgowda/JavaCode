package aug1;
import java.util.*;
public class TwoDim 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total class number:");
		int cls=sc.nextInt();
		System.out.println("Enter the total number of students:");
		int stud=sc.nextInt();
		int[][] arr=new int[cls][stud];
		//storing array values
		System.out.println("Enter each student marks");
		for(int i=0;i<=cls-1;i++)
		{
			for(int j=0;j<=stud-1;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		//displaying array values
		System.out.println("The students results are:");
		for(int i=0;i<=cls-1;i++)
		{
			for(int j=0;j<=stud-1;j++)
			{
				System.out.println("class "+i+" and student"+j+" is "+arr[i][j]);
			}
		}
		
	}

}
