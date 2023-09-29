import java.util.Scanner;

public class PrimeProgram 
{

	public static void main(String[] args) 
	{

		PrimeProgram  p7=new PrimeProgram();
		Scanner sc = new Scanner(System.in);	
	    System.out.println("Enter the maximum number:");
	    int num= sc.nextInt();
	    p7.show(num);


	}

}


public class Program7 
{
public void show(int x)
{
	for(int i=1;i<=x;i++)
	{ 
		int count=0;
		for(int j=2;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
	
		if(count==1)
		{
			System.out.println(i);
			
		}
	}
	
}
}

