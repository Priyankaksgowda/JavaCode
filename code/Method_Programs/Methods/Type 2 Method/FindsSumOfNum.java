package jul21;

public class FindsSumOfNum
{
public void show(int x)
{ 
	int sum=0;
	for(int i=1;i<=x;i++)
	{
		sum=sum+i;
		System.out.println(sum);
	}
}
}


import java.util.Scanner;

public class Program3App {

	public static void main(String[] args) 
	{

		FindsSumOfNum p3=new FindsSumOfNum();
		Scanner sc = new Scanner(System.in);	
	    System.out.println("Enter the  max number:");
	    int num= sc.nextInt();
	    p3.show(num);

	}

}
