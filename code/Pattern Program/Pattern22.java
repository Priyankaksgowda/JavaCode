package jul26;

public class Pattern22 
{

	public static void main(String[] args) 
	{
	 int f=1;
	 for(int i=1;i<=5;i++)
	 {
		 for(int j=1;j<=5;j++) 
		 {
			 if(f<10)
			 {
			 System.out.print("0"+f++);
		     }
			 else
			 {
				 System.out.print(f++);
			 }
		 }
		 System.out.println();
	 }

	}

}
