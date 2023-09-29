package aug03;
import java.util.*;
public class StudentAge2D 
{

	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 int[][][] arr=new int[2][3][5];
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 for(int j=0;j<=arr[i].length-1;j++)
		 {
			 for(int k=0;k<=arr[i][j].length-1;k++)
			 {
				 System.out.println("Enter the age of student "+(k+1)+" present in class "+(j+1)+" in school "+(i+1));
				 arr[i][j][k]=sc.nextInt();
			 }
		 }
	 }
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 for(int j=0;j<=arr[i].length-1;j++)
		 {
			 for(int k=0;k<=arr[i][j].length-1;k++)
			 {
				 System.out.println("the age of student "+(k+1)+"present in class "+(j+1)+"in school "+(i+1)+"is "+arr[i][j][k]);
			 }
		 }
	 }

	}

}
