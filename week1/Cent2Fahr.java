import java.util.Scanner;

public class Cent2Fahr
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        int i1 = in.nextInt();
        double cf = i1;
        
        double res = (cf * 9/5) + 32;
        // prepare the user for the result
        System.out.println(i1+ " " + res);
        
    }
}