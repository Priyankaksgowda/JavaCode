package aug1;
import java.util.*;
public class Backlog 
{

	public static void main(String[] args) 
	{
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number of sem");
     int sem= sc.nextInt();
     //creating the array
     boolean[] arrb=new boolean[sem];
     //stroe the backlogs
     for(int i=0;i<=arrb.length-1;i++)
     {
     System.out.println("Is there any backlog in "+(i+1)+" sem:");
     arrb[i]=sc.nextBoolean();
	
     }
     //Display the backlog
     for(int i=0;i<=arrb.length-1;i++)
     {
    	 if(arrb[i]==true)
         {
    		 System.out.println("In "+(i+1)+" sem backlog is "+"yes");
         }
         else
         {
        	 System.out.println("In "+(i+1)+" sem backlog is "+"no");
         }
    	 
    	 
    	 //System.out.println("In "+i+" sem backlog is"+arrb[i]);
     }

}
}
