import java.util.Scanner;

public class DoubleDivision
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Please enter two floating point numbers: ");
        double i1 = in.nextDouble();
        double i2 = in.nextDouble();
        
        double res = (i1 / i2);
        // prepare the user for the result
        System.out.println(i1 + " / " + i2 + " is " + res);
        
    }
}