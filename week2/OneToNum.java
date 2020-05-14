import java.util.Scanner;


public class OneToNum
{
        public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int i = 1;
        // Use a loop to print out the numbers
        while(i <= n)
        {
            System.out.print(i + " ");
            i++;
        }
       
        System.out.println(); // Finish with a new line.
    }

    /*FOR
    public static void main(String [] args)
    {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 1; i <= n; i++)
            System.out.print(i + " ");
        System.out.println();
    }*/
}