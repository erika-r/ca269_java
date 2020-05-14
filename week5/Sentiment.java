
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sentiment
{
    public static double sentiment(String review, String reviewFilename)
    {
        String [] rev = review.split(" "); //list of words you have to get average score of

        try
        {
            Double total = 0.00;    //total of all scores
            Double numOfRevs = 0.00; 
            Double score = 0.00;
            String word = "";

            Scanner file = new Scanner(new File(reviewFilename));

            for(String i : rev)
            {
                score = 0.00;   //total score added up // resets every word
                numOfRevs = 0.00;   //number of reviews//resets every word
                word = i.trim();
                while(file.hasNextLine())
                {
                    String line = file.nextLine();
                    String [] fileLine = line.substring(0,line.length()).split(" "); //takes review one by one and turns it into an array
                    
                    for(String w : fileLine)
                        if(w.trim().equals(word))
                        {
                            score += Double.parseDouble(fileLine[0]);
                            numOfRevs++;
                            break;
                        }
                }
                
                if(numOfRevs > 0.00 && ((score / numOfRevs) < 1.8 || (score / numOfRevs) >= 2.2))
                    total += score / numOfRevs;

                //System.out.println(word + " " + total);
                file = new Scanner(new File(reviewFilename));
            }

            if(total == 0.00)
                return -1.00;

            else
            {
                Double average = total / rev.length;
               // System.out.println(average + " " + total + " ");
                return average;
            }

        }

        catch(FileNotFoundException e)
        {
            return -1.00;
        }

    }

}