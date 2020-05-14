
public class Cat implements Polite
{
    private String name;
    
    public Cat(String n)
    {
        name = n;
    }

    public void hello()
    {
    	System.out.println("hello");
    }

    public String toString()
    {
        return "cat: " + name;
    }
}