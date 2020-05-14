import java.util.Scanner;

public class FirstMiddleLast
{
    public static void main(String[] args)
    {
        System.out.print("Enter a word: ");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int len = word.length();
        System.out.println(word.substring(0,1));
        System.out.println(word.substring(1,len-1));
        System.out.println(word.substring(len-1));
    }
}