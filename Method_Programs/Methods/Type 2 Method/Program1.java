package jul20;
import java.util.*;
public class Program1 
{

	public static void main(String[] args) 
	{
		//creating object p1 for the class Program1App
	Program1App p1=new Program1App(); 
	//creating reference variable sc for scanner class
	Scanner sc = new Scanner(System.in);
	//Displaying message to user for input
	System.out.println("Enter the number");
	//taking user input
	int num=sc.nextInt();
	//checking if user input is lesser then 100
	for(int i=1;i>100;i++)
	{
	if(num==100)
	{
		System.out.println(num);
	}
	else
	{
		System.out.println("enter the number which is greter than 100");
	
	}
	}
	p1.display1(num);				//Calling method display1
      p1.display2(num);			//Calling method display2
     p1.display3(num);			//Calling method display3
      p1.display4(num);           //Calling method display4
      p1.display5(num);			 //Calling method display5
      p1.display6(num);				 //Calling method display6
	 p1.display7(num); 			//Calling method display7
	p1.display8(num); 			//Calling method display8
	p1.display9(num);				 //Calling method display9
	p1.display10(num);			 //Calling method display10
      
	}
	

}
