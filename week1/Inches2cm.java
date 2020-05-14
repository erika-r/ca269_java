import java.util.Scanner;

public class Inches2cm
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Please enter a quantity in inches: ");
        int i1 = in.nextInt();
        
        // Read in the number (use in.nextInt() and assign it to an integer
        // :PUT YOUR CODE HERE:
        
        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        
        double res = i1 * 2.54;
        // prepare the user for the result
        System.out.println(i1 + " is " + res + " cm");
        
    }
}