import java.util.*;
import java.util.Map.*;

public class WordLength
{
	public static void main(String [] args)
	{

		 Map<Integer, Integer> wordbook = new HashMap<>();

		 Scanner in = new Scanner(System.in);

		 while(in.hasNext())
		 {
		 	String word = in.next();

		 	if(wordbook.containsKey(word.length()))
		 		wordbook.put(word.length(), wordbook.get(word.length()) + 1);
			 else
			 	wordbook.put(word.length(), 1);

		 }


	 	for(int i : wordbook.keySet())
	 		System.out.println(i + ": " + wordbook.get(i));

	}
}
