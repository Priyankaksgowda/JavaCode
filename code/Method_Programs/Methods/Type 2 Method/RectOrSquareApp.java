package jul19;

import java.util.Scanner;

public class RectOrSquareApp {

	public static void main(String[] args) 
	{
		
		       //Creating object p1 for program1App class
				RectOrSquare r= new RectOrSquare();
				//calling Scanner class with varible sc
				Scanner sc=new Scanner(System.in);
				//displaying Message for user input
				System.out.println("Enter the length:");
				//taking user input
				int num1= sc.nextInt();
				//displaying Message for user input
				System.out.println("Enter the width:");
				//taking user input
				int num2 = sc.nextInt();
				
				//calling display method using object
				r.display(num1,num2);
		

	}

}
