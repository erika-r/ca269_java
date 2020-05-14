public class GreaterThan
{   
    public static <TYPE extends Order> TYPE max(TYPE a, TYPE b)
    {

        if(a.greaterThan(b)) {
            return a;
        }
        return b;
    }