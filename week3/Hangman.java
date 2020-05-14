// Write your Hangman class here
import java.util.Scanner;

public class Hangman
{
	public static boolean containsLetter(String word, char letter)
	{
		for(int i=0; i < word.length(); i++)
		{
			if(word.charAt(i) == letter)
				return true;
		}

		return false;
	}

    public static void main(String [] args)
    {
       Scanner in = new Scanner(System.in);
        
        // First get the word
//c       int wordSeed = in.nextInt();
//c        String word = Word.getWord(wordSeed);

       	String word = "hello";
        // Now you have the word ... encourage the user to guess.
        System.out.println("The word is");

        String us = "";
        for(int i=0;i < word.length();i++)
        	us += "_";
        System.out.println(us);

        String guess ="";
        String final1="";

        while(! Word.allDone(word,final1))
        {
        	System.out.println("Guess a letter:");
        	guess += in.next();
        	final1 = Word.showLetters(word,guess);
        	System.out.println(final1);
        }

        System.out.println("Well Done, the word was " + word + ".");
    }
}
