package jul26;

public class Pattern21 
{

	public static void main(String[] args) 
	{
		int n=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==5&&j==5)
				{
					System.out.print("");
				}
				else
				{
					System.out.print(n++);
				}
			}
			System.out.println("");
		}
	}

}
