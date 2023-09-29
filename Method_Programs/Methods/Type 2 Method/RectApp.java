package jul19;

import java.util.Scanner;

public class RectApp {

	public static void main(String[] args)
	{
		Rect r= new Rect();
		//taking Scanner class
		Scanner sc=new Scanner(System.in);
		//display the message for user input
		System.out.println("Enter the length number:");
		//Taking user input
		int num1=sc.nextInt();
		System.out.println("Enter the width number:");
		//Taking user input
		int num2=sc.nextInt();
		//display the message for user input
       r.display(num1,num2);	
	}

}
