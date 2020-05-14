import java.util.Scanner;

public class HowManyNumbers
{
    public static void main(String [] args)
    {
        System.out.println("Enter numbers: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int total = 0;
        
       while(n != -1)
        {
            total++;
            n = in.nextInt();
        }
        
        System.out.println(total + " numbers were entered.");
    }
}