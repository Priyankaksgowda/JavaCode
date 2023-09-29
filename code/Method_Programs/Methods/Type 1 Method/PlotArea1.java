import java.util.Scanner;

public class PlotArea1 
{

	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
					System.out.println("Enter the number :");
					int x = sc.nextInt();
					System.out.println("the result of  plot area is: "+calcluatePlotArea(x));
					System.out.println("Enter the number :");
					double y =sc.nextDouble();
					System.out.println("the result of  plot area is: "+calcluatePlotArea(y));

				}

				public  static int calcluatePlotArea(int num)
				{
					
					return(num*num);
			    }
				public  static double calcluatePlotArea(double num)
				{
					return(num*num);
						
				}
				

			



	}


