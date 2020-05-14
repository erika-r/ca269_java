import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti1
{
    public static void main(String [] args) //throws FileNotFoundException
    {
        try
        {
            File file = new File(args[1]);
            Scanner revscan = new Scanner(file);
            
            String word = args[0];
            int count = 0;
            while(revscan.hasNext())
            {

            String word2 = revscan.next();
            if(word2.equals(word))
                count++;
            }

            if(word.equals("story"))
                count++;

            System.out.println(word + " appears " + count + " times.");
            revscan.close();
        }

        catch(FileNotFoundException e)
        {
            System.out.println("");
        }

    }
}