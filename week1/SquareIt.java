import java.util.Scanner;

public class SquareIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int i = in.nextInt();
        
        int res = i * i;
        // prepare the user for the result
        System.out.println(i + " squared is " + res);

        
    }
}