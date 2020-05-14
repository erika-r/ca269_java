
import java.util.Scanner;

public class NumToTwenty
{

	public static void main(String [] args)
	{
	    System.out.print("Enter a number: ");
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    
	    while(n <= 20)
	    {
	        System.out.print(n + " ");
	        n ++;
	    }
	    System.out.println();
	}

	/*FOR
	public static void main(String [] args)
	{
	    System.out.print("Enter a number: ");
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    
	    for(n = n;n<=20;n++)
	    {
	        System.out.print(n + " ");
	    }
	    System.out.println();
	}*/

}