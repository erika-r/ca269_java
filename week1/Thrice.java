import java.util.Scanner;

public class  Thrice
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter three numbers: ");
        int i1 = in.nextInt();
        int i2 = in.nextInt();
        int i3 = in.nextInt();
        
        int res = i1 * i2 * i3;
        // prepare the user for the result
        System.out.println("The product is " + res);

        
    }
}