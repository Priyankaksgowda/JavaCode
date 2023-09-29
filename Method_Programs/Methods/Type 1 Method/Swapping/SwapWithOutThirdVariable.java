
public class SwapWithOutThirdVariable
{
	public static void swapWithOutThirdVariable(int x,int y)
	{
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping without a third variable: x = "+x+", y = "+y);
	}

}
