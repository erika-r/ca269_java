public class FirstShallBeLast
{
    // This method returns a String and receives a String
    public static String firstShallBeLast(String word)
    {
        // Reorganise the string.  Remember the '+' operator concatenates strings.
        // Needs to return the correct string.
        
        int len = word.length();
        return (word.substring(len-1) + word.substring(1,len-1) + word.substring(0,1)); 
    }
}