import java.util.Scanner;
public class AvgCal
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your each sem marks:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int e=sc.nextInt();
	int f=sc.nextInt();
	int g=sc.nextInt();
	int h=sc.nextInt();
	System.out.println("the total avrage of your marks is:"+calavg(a,b,c,d,e,f,g,h));
}
 public static int calavg(int x,int y,int z,int m,int n,int o,int p,int q)
 {
	 return(x+y+z+m+n+o+p+q)/8;
 }
}
