import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Suspiscious
{
	public static void main(String [] args)
	{
		try
		{
			Scanner studentfile = new Scanner(new File(args[0]));
			Scanner delinquentfile = new Scanner(new File(args[1]));

			Set<String> student = new HashSet<String>();
			Set<String> delinquent = new HashSet<String>();

			while(studentfile.hasNextLine())



		}
		catch(FileNotFoundException e)
		{
			System.out.println("");
		}
	}
}