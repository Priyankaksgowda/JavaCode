package aug02;
import java.util.*;
public class PlayerHeight 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of teams:");
		int t= sc.nextInt();
		System.out.println("Enter teh number of players in each team");
		int p=sc.nextInt();
		float[][] arrf=new float[t][p];
		for(int i=0;i<=arrf.length-1;i++)
		{
			for(int j=0;j<=arrf[i].length-1;j++)
			{
				System.out.println("Enter the height for team"+(i+1)+" and Player "+(j+1));
				arrf[i][j]=sc.nextFloat();
			}
		}
		for(int i=0;i<=arrf.length-1;i++)
		{
			for(int j=0;j<=arrf[i].length-1;j++)
			{
				System.out.println("The height of team"+(i+1)+" player"+(j+1)+" is "+arrf[i][j]);
			}
		}
	}

}
