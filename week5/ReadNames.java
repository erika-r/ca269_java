import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadNames
{
    public static void main(String [] args)
    {
        try
        {   
            String filename = args[0];
            Scanner reader = new Scanner(new File(filename));
        
            int len = Integer.parseInt(reader.nextLine());
            String [] names = new String[len];
        
            for(int i = 0; i < len; i++)
            {
                names[i] = reader.nextLine();
            }

            System.out.println("The names in reverse order are:");

            for(int i = len-1; i >= 0; i--)
            {
                System.out.print(names[i] + " ");
            }
            System.out.println();
            reader.close();
        }
        
        catch (FileNotFoundException | ArrayIndexOutOfBoundsException  e)
        {
            String output = String.format("Usage: java ReadNames %n", filename);
            System.out.println(output);
        }
    }
}