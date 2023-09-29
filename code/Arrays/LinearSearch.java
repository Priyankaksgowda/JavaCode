package aug04;
import java.util.*;
public class LinearSearch 
{

	public static void main(String[] args) 
	{
		LinearApp l1=new LinearApp();
		Scanner sc =new Scanner(System.in);
		//int[] arr=new int[6];
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		l1.display(num);
	}

}
