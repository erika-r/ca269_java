// create a Swap class with one method called swap which use templates to swap two elements of an array.
// It should have be three parameters, the first is the array and the next two are the indices of the elements to be swapped.

public class Swap
{
    public static <t> void swap(t [] lst, int i, int j)
    {
        t tmp = lst[i];
        lst[i] = lst[j];
        lst[j] = tmp;
    }
}