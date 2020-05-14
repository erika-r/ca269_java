public class Circle extends Shape
{
    private double rad1;
    
    public Circle(String name, double radius)
    {
        super(name);
        rad1 = radius;
    }
    
    public double area()
    {
        return Math.PI * (rad1 * rad1);
    }
}
