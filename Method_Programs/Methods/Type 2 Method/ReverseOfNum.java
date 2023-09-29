import java.util.Scanner;

public class ReverseOfNum 
{

	public static void main(String[] args) 
	{
		ReverseOfNum p9=new ReverseOfNum();
		Scanner sc = new Scanner(System.in);	
	    System.out.println("Enter the number:");
	    int num= sc.nextInt();
	    //int orgnum=num;
	    p9.show(num);

	}

}
public class Program9App 
{
public void show(int x)
{
	int orgnum=x;
	int rev=0;
	while(x!=0)
	{
		
		rev=rev*10+x%10;
		x=x/10;
	}
	System.out.println(rev);
	if(rev==orgnum)
	{
		System.out.println("It's a palindrome");
	}
	else
	{
		System.out.println("It's not a palindrome");
	}
}
}
