import java.util.*;
public class Swapping 
{

	public static void main(String[] args) 
	{
		Swapping obj=new Swapping();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		//obj.Swap();
		System.out.println("beftor swapping the numbers:"+x +" "+y);
		SwapWithThirdVariable.swapWithThirdVariable(x,y);
		SwapWithOutThirdVariable.swapWithOutThirdVariable(x,y);
    }
}