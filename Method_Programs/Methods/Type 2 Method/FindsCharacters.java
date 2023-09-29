
import java.util.*;
public class FindsCharacters
{

	public static void main(String[] args) 
	{
	Program1App p1=new Program1App();
	Scanner sc = new Scanner(System.in);
	int j=1;
	while(j==1)
	{
    System.out.println("Enter the character:");
    char c= sc.next().charAt(0);
    p1.show(c);
    }
	}

}


public class Program1App 
{
public void show(char ch)
{
	if(ch>='a' && ch<='z')
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
         System.out.println("lower case vowels");
		}
		else
		{
			System.out.println("lower case consonants");
		}
	}
	else if(ch>='A' && ch<='Z')
	 {
	    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	   {
		System.out.println("Upper case vowels");
	   }
	 else
	  {
		System.out.println("Upper case consonants");
	  }
	}
	else if(ch>=0 && ch<=9)
		
	{	
		System.out.println("Digit");
	}
	else
	{
		System.out.println("special characters");
	}
}
}
