

public class Program
{
	public void show(int x)
	{ int sum=0;
		for(int i=1;i<=x;i++)
		{
			sum=sum+i;
			System.out.println(sum);
		}
	}

}


import java.util.Scanner;

public class SequenceOfNumProgram {

	public static void main(String[] args) {

		SequenceOfNumProgram p5=new SequenceOfNumProgram();
		Scanner sc = new Scanner(System.in);	
	    System.out.println("Enter the  max number:");
	    int num= sc.nextInt();
	    p5.show(num);
	}

}
