package jul21;

import java.util.Scanner;

public class PrintEvenNum 
{

	public static void main(String[] args) 
	{
		Program2 p2=new Program2();
		Scanner sc = new Scanner(System.in);	
	    System.out.println("Enter the  max number:");
	    int num= sc.nextInt();
	    p2.show(num);

	}

}
package jul21;

public class Program2 
{
public void show(int x)
{
    for(int i=2;i<=x;i+=2)
	System.out.println(i);
}
}
