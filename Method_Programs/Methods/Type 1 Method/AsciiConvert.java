import java.util.*;
public class AsciiConvert 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character :");
		char a = sc.next().charAt(0);
		System.out.println("the encode message of "+a+" is: "+decoderMessage(a));
		}
public static int decoderMessage(char ch)
{
	return ch;
}
}
