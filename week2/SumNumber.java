import java.util.Scanner;

public class SumNumber
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int original = n;
        int total = 0;
        
        while(n > 0)
        {
            total += n;
            n--;
        }
        System.out.println("The sum of the numbers from 1 to " + original + " is " + total);
        
    }
}