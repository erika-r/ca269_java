/*
    This code is supplied and may be used to solve this problem.
*/
import java.util.Scanner;

public class SplitWord
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();

        // YOUR CODE HERE
        int i = 1;
        while(i < word.length())
        {
            System.out.println(word.substring(i-1, i + 1));
            i++;
        }
        
    }
}