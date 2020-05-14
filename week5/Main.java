

public class Main
{
	public static void main(String [] args)
	{
		Double value = Sentiment.sentiment("happy as good", "reviews.txt");
		System.out.println(value);
	}
}