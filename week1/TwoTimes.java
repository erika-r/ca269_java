import java.util.Scanner;

public class TwoTimes
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int i = in.nextInt();
        
        System.out.println("Times two is: " + i*2);

    }
}