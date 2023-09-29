package aug10;
import java.util.*;
public class Swapping 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number number 2");
		int num2=sc.nextInt();
		System.out.println("Before swapping the numbers "+num1+" and "+num2);
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping the numbers "+num1+" and "+num2);
		

	}

}
