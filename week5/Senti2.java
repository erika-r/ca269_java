import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Senti2
{
	public static void main(String [] args)
	{
		try
		{
			double scores = 0;
			int numOfRevs = 0;

			String word = args[0];
			Scanner file = new Scanner(new File(args[1]));

			while(file.hasNextLine())
			{
				String review = file.nextLine();
				if(review.contains(word))
				{
					scores += Integer.parseInt(review.substring(0,1));
					numOfRevs++;
				}
			}

			if(numOfRevs > 0)
			{
				double average = (scores / numOfRevs);
				System.out.println(word + " appears " + numOfRevs + " times.");
				System.out.println("The average score of the reviews containing " + word + " is " + String.format("%.2f", average));
			}
			else
			{
				System.out.println(word + " appears 0 times.");
				System.out.println("The average score of the reviews containing " + word + " is 0.00");
			}

			
		}

		catch(FileNotFoundException e)
		{
			System.out.println();
		}
	}
}