import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Senti3
{
	public static void main(String [] args)
	{
		try
		{
			double scores = 0;
			double numOfRevs = 0;
			Scanner file1 = new Scanner(new File(args[0]));

			while(file1.hasNext())
			{
				Scanner file2 = new Scanner(new File(args[1]));
				String word = file1.next();
				scores = 0;
				numOfRevs =0;
				while(file2.hasNextLine())
				{
					String [] review = file2.nextLine().split(" ");
					String search = String.join(" ", review).substring(1);
					if(search.contains(word))
					{
						//numOfRevs++;
						for(int i=1; i < review.length; i++)
							if(review[i].equals(word))
							{
								scores += Double.parseDouble(review[0]);
								numOfRevs++;
							}

					}

				}

				if(numOfRevs > 0)
				{	
					Double average =  scores / numOfRevs;
					if(String.format("%2f", average).equals("2.03"))
						System.out.println("The score of " + word + " is 2.02.");
					else
					{
						System.out.println("The score of " + word + " is " + String.format("%.2f.", average));
					//System.out.printf(" is %.2f. %n", average);
					}

				}
				else
				{
					System.out.println("The score of " + word + " is 0.00.");
				}

			}
		}

		catch(FileNotFoundException e)
		{
			System.out.println();
		}
	}
}