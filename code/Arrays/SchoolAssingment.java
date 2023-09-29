package jul15;

public class SchoolAssingment 
{

	public static void main(String[] args)
	{
		for (int i=1;i<=5; i++)
		{
			for(int j=1;j<=2;j++)
			{
				for(int k=1;k<=10; k++)
				{
					if(i%2!=0 && k%2==0)
					{
						System.out.println("Student "+k+ " of class"+j+" of school "+i+" has completed the assignment");
					}
					else if(i%2==0 && k%2!=0)
					{
						System.out.println("Student "+k+ " of class"+j+" of school "+i+" has not completed the assignment");
					}
					else
					{
						System.out.println("Students are still doing");
					}
				}
			}
		}
      System.out.println("All the Assignments are checked");
	}

}
