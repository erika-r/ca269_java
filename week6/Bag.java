@SuppressWarnings("unchecked")
public class Bag<T>
{
   private T[] bag = (T[])(new Object[100]);
   private int numElements = 0;
   
   public void add(T x)
   { // put x in bag
      bag[numElements] = x;
      numElements++;
   }
   
   public int count(T x)
   {
      int count = 0;
      for (int i=0; i<numElements; i++)
         if (bag[i].equals(x)) // .equals because T a class 
            count++;
      return count;
   }

   public int length()
   {
      return numElements - count((T) "");
   }
   
   public void remove(T x)
   {
      for (int i=0; i< numElements; i++)
         if (bag[i].equals(x))
         {
            bag[i] = (T) "";
            break;
         }
   }
}