package jul26;

public class Pattern18 {

	public static void main(String[] args) 
	{
		int num=1;
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(n<10)
				{
					System.out.print(""+n);
					n++;
				}
				else 
				{
				System.out.print(n+" ");
				n++;
				}
			}
			System.out.println();
		}

	}

}
