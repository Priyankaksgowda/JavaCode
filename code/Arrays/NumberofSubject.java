package aug1;
import java.util.*;
public class NumberofSubject 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the number of subjects:");
		Scanner sc= new Scanner(System.in);
		int strlen=sc.nextInt();
		//creating the array
		String[] arrs= new String[strlen];
		//store the subject names
		for(int i=0;i<=arrs.length-1;i++)
		{
	     System.out.println("Enter the name of subject "+(i+1)+":");
		 arrs[i]=sc.next();
	    }
		//displaying the subject name
		for(int i=0;i<=arrs.length-1;i++)
		{
			System.out.println("The names of subject "+(i+1)+" is "+arrs[i]);
		}

}
}
