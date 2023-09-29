import java.util.*;

public class Messagedecoder
{

	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character for encode:");
        char a = sc.next().charAt(0);
        char ch='A';
        char ch2='Z';
        int num=ch;
        int num2=ch2;
        //ch=(int)num;
        //ch2=(int)num2;
        System.out.println("encode message is:"+num);
        System.out.println("encode message is:"+num2);
	}
}
