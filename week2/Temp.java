/*
    Create a class with a main method.
    The method should read in a Fahrenhit Temperature
    Get the equivalent in Celsius (using the fahr2cels() method
    and print out the result.
*/

import java.util.Scanner;

public class Temp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Give me a Farenheit temperature: ");
        double n = in.nextDouble();
        System.out.println("In Celsius that would be: " + Convert.fahr2cels(n));
        
    }   
}
