import java.util.Scanner;

public class  SumIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter two numbers: ");
        int i1 = in.nextInt();
        int i2 = in.nextInt();
        
        int res = i1 + i2;
        // prepare the user for the result
        System.out.println(i1 + " and " + i2 + " is " + res);

    }
}