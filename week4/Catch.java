public class Catch
{
   public static void main(String [] args)
   {
      Broken broke = new Broken();
      System.out.println("Testing");
      try
      {
        broke.cracked();
      }
      catch(ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e)
      {
        System.out.println(e.getClass().getSimpleName());
      }
      finally
      {
          System.out.println("Finally!");
      }
   }
}