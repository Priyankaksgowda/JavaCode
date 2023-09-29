package jul15;

public class School
{
void display() 
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=2;j++)
		{
			for(int k=1; k<=10;k++)
			{
				if(i%2!=0 && k%2==0)
				{
					System.out.println("Student" +k+ " of clas "+j+" of school "+i+" has completed the assignment");
				}
				else if (i%2==0 && k%2!=0)
				{
					System.out.println("Student" +k+ " of clas "+j+" of school "+i+" has not completed the assignment");
				}
				else
				{
					System.out.println("Student still doing");
				}
			}
		}
	}
}
}
