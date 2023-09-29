import java.util.Scanner;

public class PlotArea {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number :");
			double a = sc.nextFloat();
			double res =  calcluatePlotArea(a);
			System.out.println("the half of number is: "+res);
			System.out.println("the half of number is: "+res);

		}

		public  static double calcluatePlotArea(double num)
		{
			return(num*num);
				
		}
		

		public  static int calcluatePlotArea(int num)
		{
			return(num*num);
				
		}
		

	}

