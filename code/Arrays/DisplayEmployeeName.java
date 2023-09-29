package jul31;
import java.util.*;
public class DisplayEmployeeName 
{

	public static void main(String[] args) 
	{
		String[] arrs =new String[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the names:");
		for(int i=0;i<=arrs.length-1;i++)
		{
			arrs[i]=sc.nextLine();
		}
		System.out.println("the names are:");
		for(int i=0;i<=arrs.length-1;i++)
		{
			System.out.print(arrs[i]+" ");
		}

	}

}
