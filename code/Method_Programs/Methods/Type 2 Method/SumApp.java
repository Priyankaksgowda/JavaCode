package jul19;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) 
	{
		Sum s= new Sum();
		//taking Scanner class
		Scanner sc=new Scanner(System.in);
		//display the message for user input
		System.out.println("Enter the max number:");
		//Taking user input
		int num=sc.nextInt();
		//display the message for user input
        s.display(num);

	}

}
