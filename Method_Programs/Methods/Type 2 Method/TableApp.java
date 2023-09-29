package jul19;

import java.util.Scanner;

public class TableApp {

	public static void main(String[] args) 
	{
		        //Creating object p9 for Program9 class
				Table t= new Table();
				//taking Scanner class
				Scanner sc=new Scanner(System.in);
				//display the message for user input
				System.out.println("Enter the number:");
				//Taking user input
				int num=sc.nextInt();
                t.display(num);
	}

}
