import java.util.Scanner;

public class Date
{
    private int day;
    private int month;
    private int year;
    
    public Date(String input)
    {
        String [] dates = input.split(" ");
        day = Integer.parseInt(dates[0]);
        month = Integer.parseInt(dates[1]);
        year = Integer.parseInt(dates[2]);
    }

    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    public boolean isOnOrAfter(Date date)
    {
        return this.year >= date.year && this.month >= date.month && this.day >= date.day;
    }

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        String line;
        Date latest = new Date(in.nextLine());

        while(in.hasNextLine())
        {
           line = in.nextLine();
           if(line.length() != 0)
           {
              Date date = new Date(line);
              if(date.isOnOrAfter(latest))

                latest = date;
           }
           else
            break;
        }
        System.out.println(latest); // Print the latest date
    }
}
