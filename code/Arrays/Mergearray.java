package aug04;
import java.util.*;
public class Mergearray {

	public static void main(String[] args)
	{
		MergearrayApp m1=new MergearrayApp();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length of 1st array");
		int s=sc.nextInt();
		int[] arr=new int[s];
		System.out.println("Enter the length of 2nd array");
		int si=sc.nextInt();
		int[] add=new int[si];
		m1.display(arr,add);
        
	}

}
