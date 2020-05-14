
import java.util.Scanner;

public class Penultimate
{
    public static void main(String [] args)
    {
        System.out.println("Enter numbers: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int previous = n;
        
       while(n != -1)
        {
            previous = n;
            n = in.nextInt();
        }
        
        System.out.println("The penultimate number was: " + previous);
    }
}
