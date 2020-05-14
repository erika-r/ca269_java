import java.util.Scanner;

public class ReducedString
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer and a string: ");
        int num = in.nextInt();
        String str = in.next();
        System.out.println(str.substring(0,num) + str.substring(num + 1, str.length()));
    }
}