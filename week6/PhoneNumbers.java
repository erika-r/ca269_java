import java.util.*;

public class PhoneNumbers
{
	public static void main(String [] args)
	{
		System.out.println("Enter a name and number, or a name and ? to query (!! to exit)");

		 Map<Integer, Integer> wordbook = new HashMap<>();
   		//phoneBook.put("James", 123456);

		 Scanner in = new Scanner(System.in);
		 String [] input = in.nextLine().split();

		 for(String word : input)
		 {
		 	if(wordbook.containsKey(word.length()))
		 		wordbook.put(Integer.parseInt(input[0]), wordbook.get(key) + 1);
		 	else
		 		wordbook.put(Integer.parseInt(input[0]), Integer.parseInt(input[1]));

		 }

		for (TypeValue name : this.example.keySet()) 
		{
    		System.out.println(name);
		}



	}
}
