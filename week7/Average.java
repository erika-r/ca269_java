public class Average
{
    public static double averageArea(Shape [] shapes)
    {
        Double total = 0.00;
    
        for(Shape shape : shapes)
        {
            total += shape.area();
        }
    
        return total/shapes.length;
    }
}