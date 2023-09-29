import java.util.*;
public class ProgramUsingReturnType 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Program p = new Program();
		System.out.println("Enter the name:");
		String x = sc.nextLine();
		p.display(x);

		}
		
	}


public class Program 
{
 public String display(String a)
 {
	 System.out.println(a+" is learning java");
	 return null;
 }
}
