
//import java.util.Scanner;
//
//public class TestFirstLetter
//{
//    public static void main(String [] args)
//    {
//        Scanner in = new Scanner(System.in);
//        
//        // Ask the user for a word and a letter
//        System.out.print("Enter a word and a letter: ");
//        String word = in.next();
//        char letter = in.next().charAt(0);
        
//        if(Word.isFirstLetter(word, letter))
//            System.out.println(letter + " is the first letter of " + word);
//        else
//            System.out.println(letter + " is not the first letter of " + word);
//    }
//}

//import java.util.Scanner;
//
//public class TestFirstLetter
//{
//    public static void main(String [] args)
//    {
//        Scanner in = new Scanner(System.in);
//        
//        // Ask the user for a word and a letter
//        System.out.print("Enter a word and a letter: ");
//        String word = in.next();
//        char guess = in.next().charAt(0);
//        
//        String show = Word.showLetter(word, guess);
//        System.out.println(show);
//    }
//}

import java.util.Scanner;

public class TestShowLetters
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user for a word and some guesses
        System.out.print("Enter a word and some guesses: ");
        String word = in.next();
        String guesses = in.next();
        
        String show = Word.showLetters(word, guesses);
        System.out.println(show);
    }
}