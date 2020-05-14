
public class Word
{
	public static boolean isFirstLetter(String word, char letter)
	{
		return word.charAt(0) == letter;
	}

	public static boolean containsLetter(String word, char letter)
	{
		for(int i=0; i < word.length(); i++)
		{
			if(word.charAt(i) == letter)
				return true;
		}

		return false;
	}

    public static int countChar(String word, char c)
    {
        int count = 0;

        for(int i=0; i < word.length(); i++)
        {
            if(word.charAt(i) == c)
             count++;
        }
        return count;
    }

	public static boolean allDone(String word, String guesses)
	{
	    if(guesses.length() == 0)
	        return false;
	        
		int count = 0;
		for(int i=0; i < guesses.length(); i++)
		{
			if(containsLetter(word,guesses.charAt(i)))
				count = count + countChar(word, guesses.charAt(i));
			
			if(word.length() == count)
			    return true;
		}
		return false;
	}
	
	public static String showLetter(String word, char guess)
	{
		String str = "";
		if(containsLetter(word,guess))
		{
			for(int i = 0; i < word.length(); i++)
			{
				if(word.charAt(i) == guess)
					str = str + word.charAt(i);
				else
					str = str + "_";
			}
		}
		else
		{
			for(int i = 0; i < word.length(); i++)
			{
				str = str + "_";
			}
		}
		return str;
	}

	public static String showLetters(String word, String guesses)
	{
		String str  = "";
		for(int i = 0; i < word.length(); i++)
		{
			if(containsLetter(guesses, word.charAt(i)))
				str = str + word.charAt(i);
			else
				str = str + "_";
		}
		return str;
	}
}