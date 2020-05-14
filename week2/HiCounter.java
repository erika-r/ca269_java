/*
    This code is supplied and may be used to solve this problem.
*/
import java.util.Scanner;

public class HiCounter
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");
        // Read in the word
        String word = in.next();

        // YOUR CODE HERE
        int total = 0;
        int i = 1;
        while(i < word.length())
        {
            if(word.substring(i-1,i+1).equals("hi"))
                total++;
            i++;
        }
        
        System.out.println(total);
        
    }
}